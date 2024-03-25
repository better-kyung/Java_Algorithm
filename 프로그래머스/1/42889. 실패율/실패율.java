import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        //[1] 각 스테이지에서 실패한 사람 수 배열로 구하기
        int[] currentStages = new int[N + 1]; // 스테이지별 도달했으나 클리어하지 못한 사람 수
        int[] clearStages = new int[N + 1]; // 스테이지별 도달한 사람 수

        for (int i = 0; i < stages.length; i++) {
            // 스테이지에 도달한 플레이어 수 증가
            for (int j = 0; j < stages[i]; j++) {
                clearStages[j]++;
            }
            // 도달 했으나 클리어하지 못한 플레이어 수 증가
            currentStages[stages[i] - 1]++;
        }
        
        //[2] 각 스테이지의 실패율 구하고, (스테이지, 실패율) 형태로 map 저장하기
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            // 스테이지에 도달한 사람이 없거나 클리어한 사람이 없는 경우
            if (currentStages[i] == 0 || clearStages[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                // 실패율 계산하여 맵에 저장
                map.put(i + 1, (double) currentStages[i] / (double) clearStages[i]);
            }
        }

        
        //[3] map을 list로 바꾸고, 내림차순으로 정렬하기
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));


        //[4] list를 배열로 바꾸기
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;        
    }
}