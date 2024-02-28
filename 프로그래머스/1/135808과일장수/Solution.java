import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxCnt = score.length/m;
        int[] temp = new int[score.length];

        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            temp[i] = score[score.length - i - 1];
        }

        for (int i = 0; i < boxCnt; i++) {
            int[] box = new int[m];
            for (int j = 0; j < m; j++) {
                box[j] = temp[j + i * m];
            }
            answer += Arrays.stream(box).min().getAsInt() * m;
        }


        return answer;
    }
}
