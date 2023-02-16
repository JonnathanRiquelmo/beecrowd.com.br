// 1008 - Salário
// https://www.beecrowd.com.br/judge/pt/problems/view/1008

import java.util.Scanner;

public class bee1008 {

    public static void main(String[] args) {

        int numfun, horas;
        double sal;

        try (Scanner teclado = new Scanner(System.in)) {
            numfun = teclado.nextInt();
            horas = teclado.nextInt();
            sal = teclado.nextDouble();
        }

        sal = sal * horas;

        System.out.println("NUMBER = " + numfun);
        System.out.printf("SALARY = U$ %.2f\n", sal);
    }
}