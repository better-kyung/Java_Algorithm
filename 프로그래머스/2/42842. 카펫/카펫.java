class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        
        for (int h = 3; h <= carpet; h++) {
            if (carpet % h != 0) {
                continue;
            }
            
            int w = carpet / h;
            
            if ((w - 2) * (h - 2) == yellow) {
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        return answer;
    }
}