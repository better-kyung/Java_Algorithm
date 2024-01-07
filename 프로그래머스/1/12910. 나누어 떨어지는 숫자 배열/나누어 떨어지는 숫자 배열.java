import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> arr2 = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arr2.add(arr[i]);
            }
        }
        
        if (arr2.size() == 0) {
            arr2.add(-1);
        }
        
        answer = arr2.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}