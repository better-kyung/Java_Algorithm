import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String intToString = Integer.toString(n);
        
        for (int i = 0; i < intToString.length(); i++) {
            answer += intToString.charAt(i) - '0';
        }
        return answer;
    }
}