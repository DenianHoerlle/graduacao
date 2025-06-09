import java.util.Arrays;

public class exercicio2Aula14 {
    /*
     * Na sua função main, crie uma matriz 4x4 de doubles já preenchidos
     * e chame uma função chamada retorna diagonalSecundária()
     * que irá retornar um array de doubles contendo apenas
     * os 4 números da diagonal secundária.
     */
    public static void main(String[] args) {
        double[][] matrizPReenchida = {
            {1.0, 2.0, 3.0, 4.5},
            {1.0, 2.0, 3.5, 4.0},
            {1.0, 2.5, 3.0, 4.0},
            {1.5, 2.0, 3.0, 4.0},
        };

        System.out.println(Arrays.toString(retornaDiagonalSecundária(matrizPReenchida)));
    }
    
    public static double[] retornaDiagonalSecundária(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        double[] diagonalSecundaria = new double[linhas];

        for(int i = 0; i < linhas; i ++) {
            for (int j = 0; j < colunas; j++) {
                if (i + j == linhas - 1) {
                    diagonalSecundaria[i] = matriz[i][j];
                }
            }
        }

        return diagonalSecundaria;
    }
}
