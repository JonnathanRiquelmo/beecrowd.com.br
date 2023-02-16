// 1042 - Sort Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1042

import java.util.Scanner;

public class bee1042 {

    public static void main(String[] args) {

        int i, j, aux, vet[] = new int[3], vetcopia[] = new int[3];

        try (Scanner teclado = new Scanner(System.in)) {
            for (i = 0; i < 3; i++) {
                vet[i] = teclado.nextInt();
                vetcopia[i] = vet[i];
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (vet[i] < vet[j]) {
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            System.out.println(vet[i]);
        }
        System.out.println();
        for (i = 0; i < 3; i++) {
            System.out.println(vetcopia[i]);
        }
    }
}