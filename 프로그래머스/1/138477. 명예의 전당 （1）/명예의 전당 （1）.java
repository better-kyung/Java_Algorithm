import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hall = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                hall.add(score[i]);
                answer[i] = Collections.min(hall);
            } else {
                int minV = Collections.min(hall);
                int idx = hall.indexOf(minV);
                if (score[i] > minV) {
                    hall.set(idx, score[i]);
                    answer[i] = Collections.min(hall);
                } else {
                    answer[i] = Collections.min(hall);
                }
                
            }
        }
        return answer;
    }
}