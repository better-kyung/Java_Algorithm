import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> collatz = new ArrayList<>();
        
        while(n != 1) {
            if (n % 2 == 0) {
                collatz.add(n);
                n = n / 2;
            } else {
                collatz.add(n);
                n = 3 * n + 1;
            }
        }
        collatz.add(1);

        int[] answer = new int[collatz.size()];
        
        for (int i = 0; i < collatz.size(); i++) {
            answer[i] = collatz.get(i).intValue();
        }
        return answer;
    }
}