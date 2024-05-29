import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        List<Character> list = new ArrayList<>();
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z'};

        for (char c : alphabet) {
            if (!skip.contains(String.valueOf(c))) {
                list.add(c);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                if (list.indexOf(s.charAt(i)) + index >= list.size()) {
                    answer += list.get((list.indexOf(s.charAt(i)) + index) % list.size());
                } else {
                    answer += list.get(list.indexOf(s.charAt(i)) + index);
                }
            }
        }


        return answer;
    }
}