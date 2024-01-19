import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int idx = 0; //짝수, 홀수를 구분할 인덱스를 별도 생성
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { //공백이면 answer에 공백 추가하고 패스
                answer += " ";
                idx = 0; //공백은 단어의 기준이 되므로 다시 0처리
                continue;
            } else { //공백 아니면 인덱스의 짝수, 홀수 판별하여 대소문자 변경
                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(s.charAt(i));
                    idx++; //인덱스 증가
                } else {
                    answer += Character.toLowerCase(s.charAt(i));
                    idx++; //인덱스 증가
                }
            }
            
        }
        return answer;
    }
}