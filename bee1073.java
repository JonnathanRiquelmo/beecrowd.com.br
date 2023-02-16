// 1073 - Quadrado de Pares
// https://www.beecrowd.com.br/judge/pt/problems/view/1073

import java.util.Scanner;

public class bee1073 {

    public static void main(String[] args) {
        int N = 6;

        try (Scanner in = new Scanner(System.in)) {
            N = in.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + "^2 = %.0f\n", Math.pow(i, 2));
            }
        }
    }

}