// 1020 - Idade em Dias
// https://www.beecrowd.com.br/judge/pt/problems/view/1020

import java.util.Scanner;

public class bee1020 {

    public static void main(String[] args) {
        int ndia;
        double ano, mes, dia;

        Scanner in = new Scanner(System.in);

        ndia = in.nextInt();

        ano = ndia / 365;
        mes = (ndia % 365) / 30;
        dia = (ndia % 365) % 30;

        System.out.printf("%.0f ano(s)\n", ano);
        System.out.printf("%.0f mes(es)\n", mes);
        System.out.printf("%.0f dia(s)\n", dia);
    }
}