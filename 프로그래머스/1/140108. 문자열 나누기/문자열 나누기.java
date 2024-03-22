import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        char start = arr[0];
        int idx = 0;

        int same = 0;
        int differ = 0;

        for (int j = idx; j < arr.length; j++) {
            if (start != arr[j]) {
                differ++;
            } else if (start == arr[j]) {
                same++;
            }

            if (same == differ) {
                answer++;

                if (j + 1 >= arr.length) {
                    break;
                }

                start = arr[j + 1];
                idx = j + 1;
                same = 0;
                differ = 0;
            }

            if (j == arr.length - 1) {
                answer++;
                break;
            }
        }


        return answer;
    }
}