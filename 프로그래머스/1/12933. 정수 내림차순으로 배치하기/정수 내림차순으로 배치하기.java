import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr); //반환하지 않고 charArr 자체를 정렬해버림
        
        String tmp = "";
        for (int i = charArr.length - 1; i >= 0; i--) {
            tmp += charArr[i];
        }
        answer = Long.parseLong(tmp); //반환타입이 long이므로
        
        return answer;
    }
}