import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        ArrayList<Integer> tmpList = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
    
        for(int[] query : queries) {
            int firstIdx = query[0];
            int lastIdx = query[1];
            
            for (int i = firstIdx; i <= lastIdx; i++) {
                if (arr[i] > query[2]) {
                    tmpList.add(arr[i]);
                }
            }
            
            if (tmpList.size() > 0) {
                res.add(Collections.min(tmpList));
                tmpList.clear();
            } else {
                res.add(-1);
            }
            
        }

        answer = res.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
