public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cards1Idx = 0;
        int cards2Idx = 0;

        for (String g : goal) {
            if (cards1Idx < cards1.length && g.equals(cards1[cards1Idx])) {
                cards1Idx++; //
            } else if (cards2Idx < cards2.length && g.equals(cards2[cards2Idx])) {
                cards2Idx++; //
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
