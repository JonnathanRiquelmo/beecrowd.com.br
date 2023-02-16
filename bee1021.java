// 1021 - Notas e Moedas
// https://www.beecrowd.com.br/judge/pt/problems/view/1021

import java.util.Scanner;

public class bee1021 {

    public static void main(String[] args) {

        double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, m100 = 0, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
        double din = 0;

        try (Scanner in = new Scanner(System.in)) {
            din = in.nextDouble();
        }

        n100 = din;
        n100 = n100 - (n100 % 100);
        din = din - n100;
        n100 = n100 / 100;

        n50 = din;
        n50 = n50 - (n50 % 50);
        din = din - n50;
        n50 = (n50 / 50);

        n20 = din;
        n20 = n20 - (n20 % 20);
        din = din - n20;
        n20 = (n20 / 20);

        n10 = din;
        n10 = n10 - (n10 % 10);
        din = din - n10;
        n10 = (n10 / 10);

        n5 = din;
        n5 = n5 - (n5 % 5);
        din = din - n5;
        n5 = (n5 / 5);

        n2 = din;
        n2 = n2 - (n2 % 2);
        din = din - n2;
        n2 = (n2 / 2);

        m100 = din;
        m100 = m100 - (m100 % 1);
        din = din - m100;
        m100 = m100 / 1;

        m50 = din;
        m50 = m50 - (m50 % 0.50);
        din = din - m50;
        m50 = (m50 / 0.50);

        m25 = din;
        m25 = m25 - (m25 % 0.25);
        din = din - m25;
        m25 = (m25 / 0.25);

        m10 = din;
        m10 = m10 - (m10 % 0.10);
        din = din - m10;
        m10 = (m10 / 0.10);

        m5 = din;
        m5 = m5 - (m5 % 0.05);
        din = din - m5;
        m5 = (m5 / 0.05);

        m1 = din;
        m1 = m1 - (m1 % 0.01);
        din = din - m1;
        m1 = (m1 / 0.01);

        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", n100);
        System.out.printf("%.0f nota(s) de R$ 50.00\n", n50);
        System.out.printf("%.0f nota(s) de R$ 20.00\n", n20);
        System.out.printf("%.0f nota(s) de R$ 10.00\n", n10);
        System.out.printf("%.0f nota(s) de R$ 5.00\n", n5);
        System.out.printf("%.0f nota(s) de R$ 2.00\n", n2);
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", m100);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", m50);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", m25);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", m10);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", m5);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", m1);
    }
    
}