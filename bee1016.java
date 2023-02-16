// 1016 - Distância
// https://www.beecrowd.com.br/judge/pt/problems/view/1016

import java.util.Scanner;;;

public class bee1016 {
    public static void main(String[] args) {

        int x = 30, y = 60, dist;

        try (Scanner in = new Scanner(System.in)) {
            dist = in.nextInt();
        }

        dist = dist * (y / x);

        System.out.println(dist + " minutos");
    }
}