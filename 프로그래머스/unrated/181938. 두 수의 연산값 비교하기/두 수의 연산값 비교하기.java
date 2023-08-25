class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = ""+a+b;
        
        answer = Integer.parseInt(ab) >= 2*a*b ? Integer.parseInt(ab) : 2*a*b;
        return answer;
    }
}