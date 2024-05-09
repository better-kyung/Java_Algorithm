class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zero = 0;
        int[] answer = new int[2];

        while (!s.equals("1")) {
            String temp = s.replaceAll("0", "");
            zero += s.length() - temp.length();
            int num = temp.length();
            String binaryStr = Integer.toBinaryString(num);
            s = binaryStr;
            count++;
        }
        answer[0] = count;
        answer[1] = zero;
        return answer;
    }
}