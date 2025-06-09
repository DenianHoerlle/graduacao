import java.util.Scanner;
import java.util.Arrays;

public class aula14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Cria uma matriz 4x4 de inteiros
        int[][] matriz1 = new int[4][4];

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        // Itera sobre a matriz ( IMPORTANTE! Grave essa informação na mente )
        for (int i = 0; i < linhas; i++) { // Para cada 1 iteração de linha
            for (int j = 0; j < colunas; j++) { //  Executamos TODAS iterações da coluna
                System.out.println("Digite um valor para a matriz[" + i + "][" + j + "]");
                matriz1[i][j] = scan.nextInt();
            }
        }


        // Cria uma matriz 3x3 de Strings já preenchida
        String[][] nomes = {{"Dio", "Johnny", "Gyro"}, {"Giorno", "Mista", "Bucciarati"}, {"Josuke", "Gappy", "Kira"}};

        for (int i = 0; i < nomes.length; i++) { // Para cada 1 iteração de linha
            for (int j = 0; j < nomes[0].length; j++) { //  Executamos TODAS iterações da coluna
                if (i == j) {
                    System.out.println(nomes[i][j]);
                }
            }
        }
    }

    public static void visualizaMatriz(int[][] matriz) {
        // Pretty print da matriz (auxilia a ver a matriz)
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }

}
