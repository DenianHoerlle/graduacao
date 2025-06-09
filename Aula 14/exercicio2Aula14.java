import java.util.Arrays;

public class exercicio2Aula14 {
    /*
     * Na sua função main, crie uma matriz 4x4 de doubles já preenchidos
     * e chame uma função chamada retorna diagonalSecundária()
     * que irá retornar um array de doubles contendo apenas
     * os 4 números da diagonal secundária.
     */
    public static void main(String[] args) {
        double[][] matrizPreenchida = {
            {1.0, 2.0, 3.0, 4.0, 5.5},
            {1.0, 2.0, 3.0, 4.5, 5.0},
            {1.0, 2.0, 3.5, 4.0, 5.0},
            {1.0, 2.5, 3.0, 4.0, 5.0},
            {1.5, 2.0, 3.0, 4.0, 5.0},
        };

        System.out.println("\n\n" + Arrays.toString(retornaDiagonalSecundária(matrizPreenchida)));
    }
    
    public static double[] retornaDiagonalSecundária(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int linhaAtual;
        int colunaAtual = colunas - 1;

        double[] diagonalSecundaria = new double[linhas];

        for (linhaAtual = 0; linhaAtual < linhas; linhaAtual++) {
            diagonalSecundaria[linhaAtual] = matriz[linhaAtual][colunaAtual];
            colunaAtual--;
        }

        return diagonalSecundaria;
    }
}
