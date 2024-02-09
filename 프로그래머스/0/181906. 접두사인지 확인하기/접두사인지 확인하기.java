class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int len = is_prefix.length();
        
        if (len <= my_string.length()) {
            String str = my_string.substring(0, len);
        
            if (str.equals(is_prefix)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}