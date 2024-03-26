class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zero = 0;
        int correct = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == 0) {
                    zero ++;
                    break;
                }
                
                if (lottos[i] == win_nums[j]) {
                    correct++;
                    break;
                }
            }
        }
        
        answer[0] = lottoNum(zero + correct);
        answer[1] = lottoNum(correct);
        return answer;
    }
    
    public static int lottoNum(int num) {
    int rank = 0;
    if (num == 6) {
        rank = 1;
    } else if (num == 5) {
        rank = 2;
    } else if (num == 4) {
        rank = 3;
    } else if (num == 3) {
        rank = 4;
    } else if (num == 2) {
        rank = 5;
    } else {
        rank = 6;
    }

    return rank;
    }
}

