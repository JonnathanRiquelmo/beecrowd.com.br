// 1003 - Soma Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1003

import java.util.Scanner;

public class bee1003 {

	public static void main(String[] args) {
		
		int A, B, SOMA = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		SOMA = A + B;
		
		System.out.printf("SOMA = "+ SOMA +"\n");
	}
}