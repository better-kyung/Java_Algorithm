import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] arr = new int[10];
        
        for (int i = 0; i <= 9; i++) {
            int x = findCnt(X, i);
            int y = findCnt(Y, i);
            arr[i] = Math.min(x, y);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer += Integer.toString(i).repeat(arr[i]);
            }
        }
        
        String[] str = answer.split("");
        Arrays.sort(str, Collections.reverseOrder());
        answer = String.join("", str);
        
        if (answer.startsWith("0")) {
            answer = "0";
        }
        
        if (answer == "") {
            answer = "-1";
        }
        
        return answer;
    }
    
    public static int findCnt(String str, int c) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (char) (c + '0')) {
                cnt++;
            }
        }
        return cnt;
    }
}