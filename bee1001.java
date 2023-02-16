// 1001	Extremamente Básico
// https://www.beecrowd.com.br/judge/pt/problems/view/1001

import java.util.Scanner;

public class bee1001 {

    public static void main(String[] args) {

        int A = 0, B = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            A = entrada.nextInt();
            B = entrada.nextInt();
        }
        System.out.println("X = " + (A + B));
    }
}