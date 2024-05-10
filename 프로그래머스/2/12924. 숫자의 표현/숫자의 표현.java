class Solution {
    public int solution(int n) {
        int answer = 1;
        int left = 1;
        int sum = 0;
        
        while (sum < n) {
            for (int i = left; i < n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    sum = 0;
                    break;
                } else if (sum > n) {
                    sum = 0;
                    break;
                }
            }
            
            if (left < n) {
                left++;            
            } else {
                break;
            }
        }
        
        
        return answer;
    }
}