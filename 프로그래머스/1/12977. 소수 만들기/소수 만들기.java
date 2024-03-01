class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sumV = nums[i] + nums[j] + nums[k];
                    if (check(sumV) == true) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public boolean check(int sumV) {
        int cnt = 0;
        for (int i = 1; i * i <= sumV; i++) {
            if (i * i == sumV) {
                cnt++;
            } else if (sumV % i == 0) {
                cnt += 2;
            }
        }
        if (cnt == 2) {
            return true;
        } else {
            return false;
        }
    }
}