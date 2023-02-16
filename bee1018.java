// 1018 - Cédulas
// https://www.beecrowd.com.br/judge/pt/problems/view/1018

import java.util.Scanner;

public class bee1018 {
    public static void main(String[] args) {
        int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        int N = 0, aux = 0;

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        aux = N;

        n100 = aux;
        n100 = n100 - (n100 % 100);
        aux = aux - n100;
        n100 = n100 / 100;

        n50 = aux;
        n50 = n50 - (n50 % 50);
        aux = aux - n50;
        n50 = (n50 / 50);

        n20 = aux;
        n20 = n20 - (n20 % 20);
        aux = aux - n20;
        n20 = (n20 / 20);

        n10 = aux;
        n10 = n10 - (n10 % 10);
        aux = aux - n10;
        n10 = (n10 / 10);

        n5 = aux;
        n5 = n5 - (n5 % 5);
        aux = aux - n5;
        n5 = (n5 / 5);

        n2 = aux;
        n2 = n2 - (n2 % 2);
        aux = aux - n2;
        n2 = (n2 / 2);

        n1 = aux;
        n1 = n1 - (n1 % 1);
        aux = aux - n1;
        n1 = (n1 / 1);

        System.out.println(N);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}