// 1007 - Diferença
// https://www.beecrowd.com.br/judge/pt/problems/view/1007

import java.util.Scanner;

public class bee1007 {

    public static void main(String[] args) {

        int A, B, C, D, DIFERENCA;

        try (Scanner entrada = new Scanner(System.in)) {
            A = entrada.nextInt();
            B = entrada.nextInt();
            C = entrada.nextInt();
            D = entrada.nextInt();
        }

        DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENCA = " + DIFERENCA + "\n");
    }
}