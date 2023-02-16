// 1800 - Onde Estão Minhas Chaves
// https://www.beecrowd.com.br/judge/pt/problems/view/1800

import java.util.Scanner;

public class bee1800 {

    public static void main(String[] args) {
        boolean vet[] = new boolean[1001];
        int q, e, s;

        try (Scanner IN = new Scanner(System.in)) {
            q = IN.nextInt();
            e = IN.nextInt();

            for (int i = 0; i < 1001; i++)
                vet[i] = false;

            for (int i = 0; i < e; i++) {
                s = IN.nextInt();
                vet[s] = true;
            }

            for (int i = 0; i < q; i++) {
                s = IN.nextInt();
                if (!vet[s])
                    System.out.println(1);
                else
                    System.out.println(0);
                vet[s] = true;
            }
        }
    }

}