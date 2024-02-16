class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tempCoke = 0;
        int leftCoke = 0;
        
        while(n >= a) {
            tempCoke = (n / a) * b;
            if (tempCoke == 0) {
                break;
            }
            leftCoke = n % a;
            answer += tempCoke;
            n = tempCoke + leftCoke;
        }

        return answer;
    }
}