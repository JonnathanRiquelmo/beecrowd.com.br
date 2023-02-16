// 1759 - Ho Ho Ho
// https://www.beecrowd.com.br/judge/pt/problems/view/1759

import java.util.Scanner;;;

public class bee1759 {

    public static void main(String[] args) {

        int n;

        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print("Ho ");
        }

        System.out.print("Ho");
        System.out.print("!");
        System.out.println();
    }

}