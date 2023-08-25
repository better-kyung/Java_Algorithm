class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

//         String change = my_string.substring(s, s+ overwrite_string.length());
//         answer = my_string.replace(change, overwrite_string); // replace는 앞에서부터 단어를 찾는다. -> 고로 똑같은 단어가 앞에서 부터 반복되면 다른 답이 나올 수 있다.
        
        answer = my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        
        return answer;
    }
}