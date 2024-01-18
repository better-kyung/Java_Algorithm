class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuffer str = new StringBuffer(Integer.toString(n, 3));

        answer = Integer.parseInt(str.reverse().toString(), 3);
        return answer;
    }
}