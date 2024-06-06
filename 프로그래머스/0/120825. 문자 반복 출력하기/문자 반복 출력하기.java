import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for (char c : my_string.toCharArray()) {
            answer += String.valueOf(c).repeat(n);
        }
        
        return answer;
    }
}