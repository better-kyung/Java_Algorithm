import java.lang.Math;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int num = left; num <= right; num++) {
            int check = measure(num);

            if (check % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        return answer;
    }
    
    public int measure(int num) {
        
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (Math.pow(i, 2) == num) {
                    count++;
                } else {
                    count += 2;
                }

            }
        }
        return count;
    }
}