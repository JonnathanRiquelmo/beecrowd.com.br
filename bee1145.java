// 1145 - Sequência Lógica 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1145

import java.util.Scanner;

public class bee1145 {

    public static void main(String[] args) {
        int X = 2, Y = 0, i, j, aux = 0;

        try (Scanner teclado = new Scanner(System.in)) {
            X = teclado.nextInt();
            Y = teclado.nextInt();
        }

        for (i = 1; i < Y - 1; i++) {
            for (j = 0; j < X - 1; j++) {
                System.out.printf(i + j + " ");
                aux = i + j;
            }
            System.out.print(i + j);
            i = aux + 1;
            System.out.println();
        }
    }

}