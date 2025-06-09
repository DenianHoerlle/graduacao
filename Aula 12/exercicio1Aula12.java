import java.util.Scanner;

public class exercicio1Aula12 {
    /*
     * Crie um array de 7 posições chamado alturas e instancie seus valores
     * a partir de leituras do teclado. Após, chame uma 
     * função chamada mediaAltura() que recebe esse array como parâmetro
     * e retorna a média das alturas contidas nesse array.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] alturas = new double[7];

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Insira o valor da altura na posição " + i);
            alturas[i] = scan.nextDouble();
        }

        System.out.println("A média das alturas é " + mediaAltura(alturas));
    }

    public static double mediaAltura(double[] alturas) {
        double media = 0;
        for (int i = 0; i < alturas.length; i++) {
            media += alturas[i];
        }
        return media / alturas.length;
    }
    
}
