// 1017 - Gasto de Combustível
// https://www.beecrowd.com.br/judge/pt/problems/view/1017

import java.util.Scanner;;;

public class bee1017 {
    public static void main(String[] args) {

        int h, v;
        float d, result;

        try (Scanner in = new Scanner(System.in)) {
            h = in.nextInt();
            v = in.nextInt();
        }

        d = h * v;
        result = d / 12;

        System.out.printf("%.3f\n", result);
    }
}