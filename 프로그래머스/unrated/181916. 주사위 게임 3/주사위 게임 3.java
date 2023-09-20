import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        if (a == b && b == c && c == d) {
            return 1111 * a;
        } else if (a == b && b == c) {
            int n = 10 * a + d;
            return (int) Math.pow(n, 2);
        } else if (a == b && b == d) {
            return (int) Math.pow(10 * a + c, 2);
        } else if (a == c && c == d) {
            return (10 * a + b) * (10 * a + b) ;
        } else if (b == c && c == d) {
            return (int) Math.pow(10 * b + a, 2);
        } else if (a == b && c == d) {
            return (a + c) * Math.abs(a - c);
        } else if (a == c && b == d) {
            return (a + b) * Math.abs(a - b);
        } else if (a == d && b == c) {
            return (a + b) * Math.abs(a - b);
        } else if (a == b && b != c && c != d) {
            return c * d;
        } else if (a == c && a != b && b != d) {
            return b * d ;
        } else if (a == d && a != b && b != c) {
            return b * c;
        } else if (b == c && b != a && a != d) {
            return a * d;
        } else if (b == d && b != a && a != c) {
            return a * c;
        } else if (c == d && c != a && a != b) {
            return a * b;
        }
        return Arrays.stream(arr).min().getAsInt();
        
    }
}