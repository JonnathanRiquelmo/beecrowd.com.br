// 1078 - Tabuada
// https://www.beecrowd.com.br/judge/pt/problems/view/1078

import java.util.Scanner;

public class bee1078 {

    public static void main(String[] args) {
        int N = 3;

        try (Scanner in = new Scanner(System.in)) {
            N = in.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + N + " = " + i * N);
        }
    }

}