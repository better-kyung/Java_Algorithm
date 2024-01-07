import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) { //numbers:비교당할사람
        int answer = 0;
        int[] check = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //비교기준
        
        for (int c : check) {
            if (!IntStream.of(numbers).anyMatch(x -> x == c)) { //numbers가 c와 일치하는지 여부
                answer += c;
            }    
        }

        
        return answer;
    }
}