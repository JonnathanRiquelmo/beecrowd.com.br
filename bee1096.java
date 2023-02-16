// 1096 - Sequencia IJ 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1096

public class bee1096 {

    public static void main(String[] args) {
        int i = 1, j = 7;

        for (i = 1; i <= 9; i = i) {
            System.out.println("I=" + i + " J=" + j);
            j = j - 1;
            if (j == 4) {
                j = j + 3;
                i = i + 2;
            }
        }
    }

}