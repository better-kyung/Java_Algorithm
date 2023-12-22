class Solution {
    public int[] solution(int[] arr, int k) {
        int n = arr.length;
        int[] answer = new int[n];
        
        if (k % 2 == 0) {
            for (int i = 0; i < n; i++) {
                 answer[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < n; i++) {
                 answer[i] = arr[i] * k;
            }
        }
        
        return answer;
    }
}