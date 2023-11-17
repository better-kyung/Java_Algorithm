import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        // 주어진 l부터 r까지 모든 수를 확인
        for (int i = l; i <= r; i++) {
            String str = i + "";
            int count = 0;
            
            // 각 숫자의 한자리씩 돌아가면서
            for (int j = 0; j < str.length(); j++) {
                // 각 숫자의 자리가 0 또는 5인지 확인
                if (str.charAt(j) == 48 || str.charAt(j) == 53) {
                    count++;
                }
            }
            // 만약에 모든 숫자가 0 또는 5라면 count가 str의 길이와 동일할 것이므로
            if (count == str.length()) {
                list.add(i); // list에 그 값을 추가
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        
        if(answer.length == 0) {
            return empty;
        }
        return answer;

    }
}