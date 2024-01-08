class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        answer += "*".repeat(len - 4);
        answer += phone_number.substring((len - 4), len);
        return answer;
    }
}