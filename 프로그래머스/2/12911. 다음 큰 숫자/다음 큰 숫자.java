class Solution {
    public int solution(int n) {
        int answer = 0;
        int len = Integer.bitCount(n);
        
        int num = n;
        while (true) {
            num += 1;
            int diff = Integer.bitCount(num);
            
            if (len == diff) {
                answer = num;
                break;
            }
        }
        
        return answer;
    }
}