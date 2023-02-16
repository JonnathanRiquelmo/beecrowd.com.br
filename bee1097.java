// 1097 - Sequencia IJ 3
// https://www.beecrowd.com.br/judge/pt/problems/view/1097

public class bee1097 {

    public static void main(String[] args) {
        int i = 1, j = 7, aux = 0;

        for (i = 1; i <= 9; i = i) {
            System.out.println("I=" + i + " J=" + j);
            aux = aux + 1;
            j = j - 1;
            if (aux == 3) {
                i = i + 2;
                j = i + 6;
                aux = 0;
            }
        }
    }

}