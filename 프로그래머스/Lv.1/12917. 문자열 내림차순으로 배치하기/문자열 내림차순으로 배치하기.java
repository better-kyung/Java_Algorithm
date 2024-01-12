import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] slist = s.toCharArray();
        Arrays.sort(slist);
        StringBuilder tmp = new StringBuilder(new String(slist));
        
        answer = tmp.reverse().toString();
        return answer;
    }
}