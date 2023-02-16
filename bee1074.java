// 1074 - Par ou Ímpar
// https://www.beecrowd.com.br/judge/pt/problems/view/1074

import java.util.Scanner;

public class bee1074 {

    public static void main(String[] args) {

        int N, X;

        try (Scanner teclado = new Scanner(System.in)) {
            N = teclado.nextInt();

            for (int i = 0; i < N; i++) {

                X = teclado.nextInt();

                if (X > 0 && X % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else if (X > 0 && X % 2 != 0) {
                    System.out.println("ODD POSITIVE");
                } else if (X < 0 && X % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else if (X < 0 && X % 2 != 0) {
                    System.out.println("ODD NEGATIVE");
                } else if (X == 0) {
                    System.out.println("NULL");
                }
            }
        }
    }
    
}