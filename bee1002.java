// 1002 - Área do Círculo
// https://www.beecrowd.com.br/judge/pt/problems/view/1002

import java.util.Scanner;

public class bee1002 {

	public static void main(String[] args) {

		double area, raio, pi;
		Scanner entrada = new Scanner(System.in);

		raio = entrada.nextDouble();
		pi = 3.14159;
		area = pi * (raio * raio);

		System.out.printf("A=%.4f\n", area);
	}
}