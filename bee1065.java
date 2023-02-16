// 1065 - Pares entre Cinco Números
// https://www.beecrowd.com.br/judge/pt/problems/view/1065

import java.util.Scanner;

public class bee1065 {

    public static void main(String[] args) {
        int x = 0, tot = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                x = entrada.nextInt();
                if (x % 2 == 0) {
                    tot = tot + 1;
                }
            }
        }

        System.out.println(tot + " valores pares");

    }

}