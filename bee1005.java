// 1005 - Média 1
// https://www.beecrowd.com.br/judge/pt/problems/view/1005

import java.util.Scanner;

public class bee1005 {

    public static void main(String[] args) {

        double A, B, MEDIA;

        try (Scanner entrada = new Scanner(System.in)) {
            A = entrada.nextDouble();
            B = entrada.nextDouble();
        }

        A = A * 3.5;
        B = B * 7.5;
        MEDIA = (A + B) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}