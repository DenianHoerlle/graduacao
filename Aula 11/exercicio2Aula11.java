import java.util.Scanner;

public class exercicio2Aula11 {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do
         * segundo. Crie um método, chamada ehMultiplo, que receba os dois números como parâmetros e retorne true se o primeiro for múltiplo
         * do segundo, ou false caso contrário.
         */
        
         Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = Math.abs(scan.nextInt());
        System.out.println("Digite o segundo número: ");
        int num2 = Math.abs(scan.nextInt());
        
        System.out.println(num1 + " é multiplo de " + num2 + "? " + ehMultiplo(num1, num2));
    }

    public static boolean ehMultiplo(int num1, int num2) {
        return num1 % num2 == 0;
    }
}
