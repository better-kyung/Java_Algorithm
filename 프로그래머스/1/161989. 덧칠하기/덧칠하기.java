class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int s = section[0];
        int e = section[0] + (m - 1);
        
        for (int sec : section) {
            if (s <= sec && sec <= e) {
                continue;
            } else {
                s = sec;
                e = sec + (m - 1);
                answer++;
            }
        }
        
        return answer;
        
        
    }
}