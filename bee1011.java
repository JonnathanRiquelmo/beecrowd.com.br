// 1011 - Esfera
// https://www.beecrowd.com.br/judge/pt/problems/view/1011

import java.util.Scanner;

public class bee1011 {

	public static void main(String[] args) {
		
		int A; 
		double Raio, Pi = 3.14159;
		
		try (Scanner teclado = new Scanner(System.in)) {
            A = teclado.nextInt();
        }

		Raio = (4/3.0) * Pi * Math.pow(A, 3);
		
		System.out.printf("VOLUME = %.3f\n", Raio);
	}
}