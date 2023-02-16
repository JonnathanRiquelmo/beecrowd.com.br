// 1060 - Números Positivos
// https://www.beecrowd.com.br/judge/pt/problems/view/1060

import java.util.Scanner;

public class bee1060 {

    public static void main(String[] args) {

        float n[] = new float[6];
        int i, positivos = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            for (i = 0; i < 6; i++) {
                n[i] = entrada.nextFloat();

                if (n[i] > 0) {
                    positivos = positivos + 1;
                }
            }
        }
        System.out.println(positivos + " valores positivos");
    }
    
}