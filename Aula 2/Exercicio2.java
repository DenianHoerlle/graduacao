import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
         * Solicite ao usuário que informe um número fracionário e o imprima como um número inteiro (sem ponto decimal).
         */
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número com uma ou mais casas decimais");
        double doubleNumber = scan.nextDouble();
        boolean isInteger = doubleNumber % 1 == 0;
        String formattedNumber = String.format("%.0f", doubleNumber);
        
        // Balaca
        if (isInteger) {
            System.out.println("O número " + formattedNumber + " já é inteiro!");
        } else {
            System.out.println("Seu número inteiro é " + formattedNumber);
        }
    }
}