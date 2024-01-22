class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        
        char changeAlp = alp.charAt(0);
        String upperAlp = String.valueOf(Character.toUpperCase(changeAlp));
            

        answer = my_string.replaceAll(alp, upperAlp);
        
        
        return answer;
    }
}