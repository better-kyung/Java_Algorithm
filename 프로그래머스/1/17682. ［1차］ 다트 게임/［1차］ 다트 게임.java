import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] result = dartResult.toCharArray();
        int[] score = new int[3];
        int idx = -1;
        
        for (int i = 0; i < result.length; i++) {
            if (result[i] == '1' && result[i + 1] == '0') {
                idx++;
                score[idx] = 10;
                i++;
                continue;
            } else if (result[i] >= '0' && result[i] <= '9') {
                idx++;
                score[idx] = Integer.parseInt(String.valueOf(result[i]));
                continue;
            }
            
            switch (result[i]) { //최소한 문자 전에는 숫자가 저장되어 있을 거니까
                case 'D':
                    score[idx] = (int) Math.pow(score[idx], 2);
                    break;
                case 'T':
                    score[idx] = (int) Math.pow(score[idx], 3);
                    break;
                case '*':
                    score[idx] *= 2;
                    // 첫 번째 라운드인 경우에는 이전 라운드가 없으므로 조건 판단
                    if (idx - 1 >= 0) {
                        score[idx - 1] *= 2;
                    }
                    break;
                case '#':
                    score[idx] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];
        
        return answer;
    }
}