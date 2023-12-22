class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        my_string = my_string.trim(); // trim()은 문자열의 앞 뒤 공백을 지워준다
        answer = my_string.split("\\s+"); // \\s+는 하나 이상의 공백을 의미한다.
        // \s : 공백을 의미하는 특수문자
        
        return answer;
    }
}