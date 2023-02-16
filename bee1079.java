// 1079 - Médias Ponderadas
// https://www.beecrowd.com.br/judge/pt/problems/view/1079

import java.util.Scanner;;;

public class bee1079 {

    public static void main(String[] args) {

        int n, i;
        float p1, p2, p3, media;

        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();

            for (i = 0; i < n; i++) {
                p1 = in.nextFloat();
                p2 = in.nextFloat();
                p3 = in.nextFloat();

                media = ((p1 * 2) + (p2 * 3) + (p3 * 5)) / 10;

                System.out.printf("%.1f\n", media);
            }
        }
    }

}