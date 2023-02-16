// 1009 - Salário com Bônus
// https://www.beecrowd.com.br/judge/pt/problems/view/1009

import java.util.Scanner;

public class bee1009 {

    public static void main(String[] args) {

        double salfixo, vendas;

        try (Scanner teclado = new Scanner(System.in)) {
            salfixo = teclado.nextDouble();
            vendas = teclado.nextDouble();
        }

        salfixo = salfixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salfixo);
    }
}