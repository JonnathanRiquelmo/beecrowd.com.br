// 1010 - Cálculo Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1010

import java.util.Scanner;

public class bee1010 {

    public static void main(String[] args) {

        int p1qtd, p2qtd;
        double p1valor, p2valor, result;

        try (Scanner teclado = new Scanner(System.in)) {
            p1qtd = teclado.nextInt();
            p1valor = teclado.nextDouble();
            p2qtd = teclado.nextInt();
            p2valor = teclado.nextDouble();
        }

        result = (p1qtd * p1valor) + (p2qtd * p2valor);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);
    }
}
