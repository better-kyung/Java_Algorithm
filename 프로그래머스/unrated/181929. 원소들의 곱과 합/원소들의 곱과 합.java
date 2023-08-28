import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
        }
        
        int sum_tmp = Arrays.stream(num_list).sum();

        if ((sum_tmp * sum_tmp) > mul) {
            answer = 1;
        }
        
        return answer;
    }
}