import java.util.*;
import java.util.stream.IntStream;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        //B를 내림차순 정렬하는 대신
        for (int i = 0; i < B.length / 2; i++) {
          int temp = B[i];
          B[i] = B[B.length - 1 - i];
          B[B.length - 1 - i] = temp;
        }
        
        //여기서 A[i] + B[B.length - i - 1]
        for (int i = 0; i < A.length; i++) {
            // System.out.println(A[i] + " " + sortedB[i]);
            answer += A[i] * B[i];
        }

        return answer;
    }
}