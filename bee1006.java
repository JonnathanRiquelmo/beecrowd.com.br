// 1006 - Média 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1006

import java.util.Scanner;

public class bee1006 {

    public static void main(String[] args) {

        double A, B, C, MEDIA;

        try (Scanner entrada = new Scanner(System.in)) {
            A = entrada.nextDouble();
            B = entrada.nextDouble();
            C = entrada.nextDouble();
        }

        A = A * 2;
        B = B * 3;
        C = C * 5;
        MEDIA = (A + B + C) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}