
import java.util.Scanner;

public class Main {
    public double newScore() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] score = new double[n];
        double maxScore = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            if (score[i] > maxScore) {
                maxScore = score[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            score[i] = score[i] / maxScore * 100;
            sum += score[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.newScore());
        
    }
}
