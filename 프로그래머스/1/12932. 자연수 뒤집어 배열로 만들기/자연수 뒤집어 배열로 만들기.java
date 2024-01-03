class Solution {
    public int[] solution(long n) {
        int len = Long.toString(n).length();
        String change = Long.toString(n);
        int[] answer = new int[len];
        
        for (int i = (len - 1); i >= 0; i--) {
            answer[len - i - 1] = change.charAt(i) - '0';
        }
        
        
        
        
        return answer;
    }
}