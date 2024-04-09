import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int[] temp = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    temp[i] = arr[i];            
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                list.add(arr[i]);
            }
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}