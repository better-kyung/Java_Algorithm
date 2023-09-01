import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            res.add(i);
        }
        answer = res.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}