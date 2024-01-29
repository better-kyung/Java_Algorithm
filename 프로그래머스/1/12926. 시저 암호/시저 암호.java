class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            int asc = (int) x;
            
            if (x == ' ') {
                answer += " ";
                continue;
            } else if (asc >= 97 && asc <= 122) {
                if (asc + n > 122) {
                    char change = (char) (97 + (asc + n - 123));
                    answer += Character.toString(change);
                } else {
                    answer += Character.toString((char) (asc + n));
                }   
            } else if (asc >= 65 && asc <= 90) {
                if (asc + n > 90) {
                    char change = (char) (65 + (asc + n - 91));
                    answer += Character.toString(change);
                } else {
                    answer += Character.toString((char) (asc + n));
                }   
            }
        }
        return answer;
    }
}