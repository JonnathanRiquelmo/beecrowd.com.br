// 1064 - Positivos e Média
// https://www.beecrowd.com.br/judge/pt/problems/view/1064

import java.util.Scanner;

public class bee1064 {

    public static void main(String[] args) {

        float n[] = new float[6], soma = 0, result;
        int i, positivos = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            for (i = 0; i < 6; i++) {

                n[i] = entrada.nextFloat();

                if (n[i] > 0) {
                    positivos = positivos + 1;
                    soma = soma + n[i];
                }
            }
        }

        result = soma / positivos;

        System.out.println(positivos + " valores positivos");
        System.out.println(result);
    }

}