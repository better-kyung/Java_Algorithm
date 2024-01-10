class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'p' || c == 'P') {
                p += 1;
            }
            
            if (c == 'y' || c == 'Y') {
                y += 1;
            }
        }
        if (p != y) {
            return false;
        }

        return answer;
    }
}