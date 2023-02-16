// 1035 - Teste de Seleção 1
// https://www.beecrowd.com.br/judge/pt/problems/view/1035

import java.util.Scanner;

public class bee1035 {
    public static void main(String[] args) {
        int A, B, C, D;

        Scanner in = new Scanner(System.in);

        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}