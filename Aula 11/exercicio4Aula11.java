import java.util.Scanner;

public class exercicio4Aula11 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia uma frase e conte quantas vogais ela possui. Para isso, sua função main deverá
         * passar a frase lida para um método chamado contaVogais, a qual deverá imprimir o resultado.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        contaVogais(frase);
    }

    public static void contaVogais(String frase) {
        int quantidadeDeVogais = 0;

        for (int count = 0; count < frase.length(); count++) {
            if (ehVogal(frase.toLowerCase().charAt(count))) {
                quantidadeDeVogais++;
            }
        }

        System.out.println("A frase tem " + quantidadeDeVogais + " vogais.");
    }

    public static boolean ehVogal(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ) {
            return true;
        }

        return false;
    }
}
