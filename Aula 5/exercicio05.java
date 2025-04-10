import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        /*
         * CONJECTURA DE COLLATZ
         * Peça do usuário um número inteiro.
         * Aplique as fórmulas da conjectura até que o número seja 1.
         * 
         * Se o número for par, divida por 2;
         * Se o número for impar, multiplique por 3  e some 1 ao resultado;
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int collatzNumber = scan.nextInt();

        System.out.print(collatzNumber + " => ");

        while (collatzNumber != 1) {
            boolean isOdd = collatzNumber % 2 == 0;

            if (isOdd) collatzNumber /= 2;
            else collatzNumber = collatzNumber * 3 + 1;

            System.out.print(collatzNumber);

            if (collatzNumber != 1) {
                System.out.print(" => ");
            }
        }
    }
}
