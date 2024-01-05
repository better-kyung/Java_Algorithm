class Solution {
    public int solution(int num) {
        int answer = 0;
        int limit = 0;
        long num2 = num;
        
        while (num2 != 1) {
            if (limit == 500) {
                return -1;
            }
            if (num2 % 2 == 0) {
                num2 = num2 / 2;
                answer++;
            } else {
                num2 = (num2 * 3) + 1;
                answer++;
            }
            limit++;
        }

        return answer;
    }
}