// 1095 - Sequencia IJ 1
// https://www.beecrowd.com.br/judge/pt/problems/view/1095

public class bee1095 {

    public static void main(String[] args) {
        int i = 1;

        for (int j = 60; j >= 0; j = j - 5) {
            System.out.println("I=" + i + " J=" + j);
            i = i + 3;
        }
    }

}