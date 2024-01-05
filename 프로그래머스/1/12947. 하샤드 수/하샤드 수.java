class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = Integer.toString(x);
        int total = 0;
        
        for (int i = 0; i < str.length(); i++) {
            total += str.charAt(i) - '0';
        }
        
        if (x % total == 0) {
            answer = true;
            return answer;
        }
        
        return answer;
    }
}