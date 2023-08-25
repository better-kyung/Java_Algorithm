class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        
        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            answer = Integer.parseInt(ab);
        } else {
            answer = Integer.parseInt(ba);
        }
        return answer;
    }
}