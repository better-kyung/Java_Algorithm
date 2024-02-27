import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        List<Integer> temp = new ArrayList<>();
        int[] student1List = {1, 2, 3, 4, 5};
        int[] student2List = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3List = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] studentsAns = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            if (ans == student1List[i % 5]) {
                studentsAns[0]++;
            }

            if (ans == student2List[i % 8]) {
                studentsAns[1]++;
            }

            if (ans == student3List[i % 10]) {
                studentsAns[2]++;
            }
        }

        int maxV = Arrays.stream(studentsAns).max().getAsInt();

        for (int i = 0; i < 3; i++) {
            if (studentsAns[i] == maxV) {
                temp.add(i + 1);
            }
        }

        int[] answer = temp.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
