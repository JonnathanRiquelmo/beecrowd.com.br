// 1805 - Soma Natural
// https://www.beecrowd.com.br/judge/pt/problems/view/1805

import java.util.Scanner;

public class bee1805 {

    public static long soma1aten(long n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        long a = 0, b = 0, r = 0;

        try (Scanner IN = new Scanner(System.in)) {
            a = IN.nextInt();
            b = IN.nextInt();
        }

        r = soma1aten(b) - soma1aten(a - 1);

        System.out.println(r);
    }

}