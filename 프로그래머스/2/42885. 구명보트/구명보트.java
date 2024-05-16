import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++; //최소값의 포인터 이동
            answer++; //혼자가든 둘이 가든 값은 보트 추가
        }

        return answer;
    }
}