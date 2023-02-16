// 1072 - Intervalo 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1072

import java.util.Scanner;

public class bee1072{ 
 
    public static void main(String[] args) {
        int N=0, Ns=0, in=0, out=0;
        
        try (Scanner teclado = new Scanner(System.in)) {
            N = teclado.nextInt();
            
            for (int i = 0; i < N; i++) {
            	Ns = teclado.nextInt();
            	if (Ns<=20 && Ns>=10) {
            		in = in + 1;
            	} else {
            		out = out + 1;
            	}
            }
        }

        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
