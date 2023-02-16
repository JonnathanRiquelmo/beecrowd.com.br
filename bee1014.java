// 1014 - Consumo
// https://www.beecrowd.com.br/judge/pt/problems/view/1014

import java.util.Scanner;

public class bee1014 {

    public static void main(String[] args) {
        int dist;
        float litgast, consumomedio;

        try (Scanner in = new Scanner(System.in)) {
            dist = in.nextInt();
            litgast = in.nextFloat();
        }

        consumomedio = dist / litgast;

        System.out.printf("%.3f km/l\n", consumomedio);
    }
}