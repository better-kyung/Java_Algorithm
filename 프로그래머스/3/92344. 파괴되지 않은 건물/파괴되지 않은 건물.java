class Solution {
    public int solution(int[][] board, int[][] skill) {
        int N = board.length;
        int M = board[0].length;
        int[][] matrix = new int[N + 1][M + 1];
        
        for (int[] s : skill) {
            int degree = s[5] * ((s[0] == 1) ? -1 : 1);
            
            matrix[s[1]][s[2]] += degree;
            matrix[s[1]][s[4] + 1] += (degree * -1);
            matrix[s[3] + 1][s[2]] += (degree * -1);
            matrix[s[3] + 1][s[4] + 1] += degree;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < M; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        
        for (int j = 0; j < M; j++) {
            for (int i = 1; i < N; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
        
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] + matrix[i][j] > 0) {
                    answer++;
                }
            }
        }
    
        return answer;
    }
}