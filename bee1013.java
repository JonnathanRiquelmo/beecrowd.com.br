// 1013 - O Maior
// https://www.beecrowd.com.br/judge/pt/problems/view/1013

import java.util.Scanner;

public class bee1013 {

    public static void main(String[] args) {

        int a, b, c, maior;

        try (Scanner entrada = new Scanner(System.in)) {
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = entrada.nextInt();
        }

        maior = (a + b + Math.abs(a - b)) / 2;

        if (maior > c) {
            System.out.println(maior + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }
    }
}