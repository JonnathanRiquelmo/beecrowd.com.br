// 1080 - Maior e Posição
// https://www.beecrowd.com.br/judge/pt/problems/view/1080

import java.util.Scanner;

public class bee1080 {
    public static void main(String[] args) {
        int vetor[] = new int[100], maior = 0, posicao = 0;

        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 100; i++) {
                vetor[i] = in.nextInt();

            }
        }

        maior = vetor[0];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (vetor[j] > vetor[i] && vetor[j] > maior) {
                    maior = vetor[j];
                    posicao = j;
                }
            }
        }

        System.out.println(maior);
        System.out.println(posicao + 1);
    }

}