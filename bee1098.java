// 1098 - Sequencia IJ 4
// https://www.beecrowd.com.br/judge/pt/problems/view/1098

public class bee1098 {

    public static void main(String[] args) {

        double i = 0, j = 1, aux = 0.2;

        for (i = 0; i <= 2; i = i + 0.2) {
            if (i == 0) {
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 1);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 2);
            } else if (i == 1) {
                System.out.printf("I=%.0f J=%.0f\n", i, j + 1);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 2);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 3);
                aux = aux + 0.2;
            } else if (i > 1.9) {
                System.out.printf("I=%.0f J=%.0f\n", i, j + 2);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 3);
                System.out.printf("I=%.0f J=%.0f\n", i, j + 4);
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, j + aux);
                System.out.printf("I=%.1f J=%.1f\n", i, j + 1 + aux);
                System.out.printf("I=%.1f J=%.1f\n", i, j + 2 + aux);
                aux = aux + 0.2;
            }
        }
    }

}