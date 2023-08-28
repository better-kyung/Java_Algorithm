class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        answer += String.valueOf(code.charAt(i));
                    }
                }
            }
            else {
                if (code.charAt(i) == '1') {
                    mode = 0;
                } else {
                    if (i % 2 == 1) {
                        answer += String.valueOf(code.charAt(i));
                    }
                }
            }
        }
        
        if (answer.equals("")) {
            answer = "EMPTY";
        }
        
        // 이 문제의 핵심 : mode가 0이고, idx가 짝수(결국 나머지가 0)일 때 즉 mode와 짝/홀수가 일치할 때
        // 문자열을 붙인다 !!
        return answer;
    }
}