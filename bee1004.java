// 1004 - Produto Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1004

import java.util.Scanner;

public class bee1004 {

    public static void main(String[] args) {

        int A, B, PROD = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            A = entrada.nextInt();
            B = entrada.nextInt();
        }

        PROD = A * B;

        System.out.printf("PROD = " + PROD + "\n");
    }
}