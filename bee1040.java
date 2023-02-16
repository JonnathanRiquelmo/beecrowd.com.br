// 1040 - Média 3
// https://www.beecrowd.com.br/judge/pt/problems/view/1040

import java.util.Scanner;

public class bee1040 {

    static double EPSILON = 1e-9;

    public static void main(String[] args) {
        double a, b, c, d;
        double novmedia, media;

        try (Scanner entrada = new Scanner(System.in)) {
            a = entrada.nextDouble();
            b = entrada.nextDouble();
            c = entrada.nextDouble();
            d = entrada.nextDouble();

            media = (a * 2 + b * 3 + c * 4 + d) / 10.0 - EPSILON;
            System.out.printf("Media: %.1f\n", media);

            if (media >= 7.0) {
                System.out.println("Aluno aprovado.");
            } else if (media <= 4.99) {
                System.out.println("Aluno reprovado.");
            } else {
                System.out.println("Aluno em exame.");
                double nota = entrada.nextDouble();

                System.out.printf("Nota do exame: %.1f\n", nota);
                novmedia = (media + nota) / 2.0;

                if (novmedia <= 4.99)
                    System.out.println("Aluno reprovado.");
                else
                    System.out.println("Aluno aprovado.");

                System.out.printf("Media final: %.1f\n", novmedia);
            }
        }
    }

}