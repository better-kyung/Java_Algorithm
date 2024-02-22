class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        
        for (int i = 0; i < a - 1; i++) { //1월 부터 a월 전까지
            days += monthDays[i]; //일 수 더하기
        }
        days += (b - 1); //a월의 b일 더하기(시작일을 포함하지 않음)
        
        int remain = days % 7; //나머지 구하기
        System.out.println(remain);
        
        answer = week[remain];
        
        return answer;
    }
}