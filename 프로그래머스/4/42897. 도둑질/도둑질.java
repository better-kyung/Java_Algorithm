import java.util.*;
class Solution {
    public int solution(int[] money) {
        int answer = 0;
        if (money.length == 1) {
            return money[0];
        }
        
        int[][] dp = new int[2][money.length];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = money[1];
        
        for (int i = 2; i < money.length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[0][i - 2] + money[i]);
            dp[1][i] = Math.max(dp[1][i - 1], dp[1][i - 2] + money[i]);
        }
        
        answer = Math.max(money[0] + dp[0][money.length - 2], dp[1][money.length - 1]);
        
        return answer;
    }
}