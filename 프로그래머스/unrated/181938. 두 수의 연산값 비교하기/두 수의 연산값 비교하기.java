class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = ""+a+b;
        String twoab = ""+(2*a*b);
        
        answer = Integer.parseInt(ab) >= Integer.parseInt(twoab) ? Integer.parseInt(ab) : Integer.parseInt(twoab);
        return answer;
    }
}