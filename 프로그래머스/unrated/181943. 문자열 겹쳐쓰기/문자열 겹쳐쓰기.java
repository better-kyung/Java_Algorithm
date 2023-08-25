class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

//         String change = my_string.substring(s, s+ overwrite_string.length());
//         // System.out.println(change);
        
//         answer = my_string.replace(change, overwrite_string);
        answer = my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        
        return answer;
    }
}