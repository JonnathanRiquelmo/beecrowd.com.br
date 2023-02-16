// 1174 - Seleçao em Vetor I
// https://www.beecrowd.com.br/judge/pt/problems/view/1174

import java.util.Scanner;

public class bee1174 {

    public static void main(String[] args) {
        float vetor[] = new float[100];
        int i;

        try (Scanner in = new Scanner(System.in)) {
            for (i = 0; i < 100; i++) {
                vetor[i] = in.nextFloat();
            }
        }

        for (i = 0; i < 100; i++) {
            if (vetor[i] <= 10) {
                System.out.printf("A[" + i + "] = %.1f\n", vetor[i]);
            }
        }
    }

}