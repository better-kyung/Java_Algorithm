import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; //체육수업 들을 수 있는 학생의 최댓값
        int count = 0; //빌린 학생 수
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여벌 옷을 가진 학생이 도난 당한 경우(빌려줄 수 없음)
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    count++; //내가 나에게 빌렸다 치고 빌린 학생 수 증가
                    lost[i] = reserve[j] = -1; //의미없는 값으로 초기화
                    break;
                }
            }
        }
        
        
        //여벌 옷을 가진 학생이 다른 학생에게 빌려주는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) { //여분 옷을 앞 뒤 학생들에게 줄 수 있을 때
                    reserve[j] = lost[i] = -1; //빌려줬으니까 의미없는 값으로 초기화
                    count++;
                    break;
                }
            }
        }
        
        answer = n - lost.length + count;
        return answer;
    }
}