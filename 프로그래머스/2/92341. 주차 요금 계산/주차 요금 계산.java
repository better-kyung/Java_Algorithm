import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parkingLogs = new HashMap<>();
        Map<String, Integer> parkingTimes = new HashMap<>();
        
        for (String record : records) {
            String[] log = record.split(" ");
            String[] time = log[0].split(":");
            if (log[2].equals("IN")) {
                parkingLogs.put(log[1], Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]));
            } else {
                int elapasedTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]) - parkingLogs.get(log[1]);
                parkingTimes.put(log[1], parkingTimes.getOrDefault(log[1], 0) + elapasedTime);
                parkingLogs.remove(log[1]);
            }
        }
        
        for (Map.Entry<String, Integer> parkingLog : parkingLogs.entrySet()) {
            parkingTimes.put(parkingLog.getKey(), parkingTimes.getOrDefault(parkingLog.getKey(), 0) + 23 * 60 + 59 - parkingLog.getValue());
        }
        
        List<String> parkingTimesByKey = new ArrayList<>(parkingTimes.keySet());
        parkingTimesByKey.sort(Comparator.comparingInt(Integer::parseInt));
        
        int[] answer = new int[parkingTimesByKey.size()];
        int i = 0;
        for (String k : parkingTimesByKey) {
            int fee;
            if (parkingTimes.get(k) <= fees[0]) {
                fee = fees[1];
            } else {
                fee = fees[1] + (int) Math.ceil((float) (parkingTimes.get(k) - fees[0]) / fees[2]) * fees[3];
            }
            answer[i] = fee;
            i++;
        }
        
        return answer;
    }
}