// 1075 - Resto 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1075

import java.util.Scanner;

public class bee1075 {
    public static void main(String[] args) {
        int N = 0;

        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        for (int i = 1; i < 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }
    }
}