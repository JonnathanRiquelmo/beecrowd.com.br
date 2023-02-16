// 1038 - Lanche
// https://www.beecrowd.com.br/judge/pt/problems/view/1038

import java.util.Scanner;;;

public class bee1038 {
    public static void main(String[] args) {

        int cod, qtd;
        double total = 0;

        try (Scanner in = new Scanner(System.in)) {
            cod = in.nextInt();
            qtd = in.nextInt();
        }

        if (cod == 1) {
            total = qtd * 4;
        } else if (cod == 2) {
            total = qtd * 4.5;
        } else if (cod == 3) {
            total = qtd * 5;
        } else if (cod == 4) {
            total = qtd * 2;
        } else if (cod == 5) {
            total = qtd * 1.5;
        }

        System.out.printf("Total: R$ %.2f\n", total);

    }
}