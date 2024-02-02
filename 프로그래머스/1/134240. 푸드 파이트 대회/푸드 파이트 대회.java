class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for (int i = food.length - 1; i > 0; i--) {
            int count = food[i] / 2;
            answer = Integer.toString(i).repeat(count) + answer + 
                Integer.toString(i).repeat(count);
        }
        
        return answer;
    }
}