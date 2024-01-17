import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> setList = new ArrayList<>();
        
        int i = 0;
        setList.add(arr[0]);
        int check = arr[0];
        while (i < arr.length - 1) {
            i++;
            if (check == arr[i]) {
                continue;
            } else {
                check = arr[i];
                setList.add(check);
            }
        }
        // System.out.println(setList);
        answer = setList.stream().mapToInt(e -> e).toArray();
        
        return answer;
    }
}