import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        double i = Math.sqrt(n);

        if (i - (int) i == 0) {
            i += 1;
            answer = (long) i * (long) i;
        } else {
            answer = -1;
        }
        return answer;
    }
}