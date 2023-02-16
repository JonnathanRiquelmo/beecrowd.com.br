// 1144 - Sequência Lógica
// https://www.beecrowd.com.br/judge/pt/problems/view/1144

import java.util.Scanner;

public class bee1144 {
    
    public static void main(String[] args) {
        int i, x, y;

        try (Scanner in = new Scanner(System.in)) {
            x = in.nextInt();
        }

        for (i = 1; i <= x; i++) {
            y = 0;
            System.out.print(i + " ");
            y = i * i;
            System.out.print(y + " ");
            y = i * i * i;
            System.out.print(y);

            System.out.println();

            System.out.print(i + " ");
            y = i * i + 1;
            System.out.print(y + " ");
            y = i * i * i + 1;
            System.out.print(y + "\n");
        }
    }

}