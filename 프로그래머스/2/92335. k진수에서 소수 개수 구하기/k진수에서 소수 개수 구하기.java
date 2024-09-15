class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);
        for (String s : str.split("0")) {
            if (s.equals("")) {
                continue;
            }
            if (isPrime(Long.parseLong(s))) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isPrime(long num) {
        if (num == 1 || (num > 2 && num % 2 == 0)) {
            return false;
        }
        
        for (int i = 3; i <= (int) Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}