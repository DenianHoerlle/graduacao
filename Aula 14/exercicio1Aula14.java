import java.util.Arrays;

public class exercicio1Aula14 {
    /*
     * 1) Na sua função main, crie uma matriz 5x5 já preenchida e chame uma função chamada calculaMatriz() que irá imprimir
     * a) A soma dos números ímpares fornecidos;
     * b) A soma de cada uma das 5 colunas;
     * c) A soma de cada uma das 5 linhas;
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, 2, 3, 4},
            {0, 1, 2, 3, 4},
            {0, 1, 2, 3, 4},
            {0, 1, 2, 3, 4},
            {0, 1, 2, 3, 4},
        };

        calculaMatriz(matriz);

    }

    public static void calculaMatriz(int[][] m) {
        int linhas = m.length;
        int colunas = m[0].length;

        int somaImpares = 0;
        int[] somaLinhas = new int[linhas];
        int[] somaColunas = new int[colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (m[i][j] % 2 != 0) {
                    somaImpares += m[i][j];
                }
                somaLinhas[i] += m[i][j];
                somaColunas[j] += m[i][j];
            }
        }

        System.out.println(somaImpares + " | " + Arrays.toString(somaLinhas) + " | " + Arrays.toString(somaColunas));
    }
}
