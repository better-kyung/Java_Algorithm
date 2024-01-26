import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxW = 0;
        int maxH = 0;
        for(int[] size : sizes) {
            maxW = Math.max(Math.max(size[0], size[1]), maxW);
            maxH = Math.max(Math.min(size[0], size[1]), maxH);
        }
        
        answer = maxW * maxH;
        
        return answer;
    }
}