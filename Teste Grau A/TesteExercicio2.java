import java.util.Scanner;

public class TesteExercicio2 {
    /*
     * Na função main, peça para o usuário digitar um número inteiro positivo qualquer (num) e passe esse
     * número como parâmetro para uma função, a qual deverá retornar a quantidade de dígitos nesse
     * número. Sua função main deverá imprimir: O número < > é composto por < > dígitos.
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.println("Digite um número inteiro positivo"); // e que não tenha mais que 10 digitos senão o java diz que é uma String???
       int num = Math.abs(scan.nextInt());

       int digits = checkAmountOfDigits(num);

       System.out.println("O número " + num + " é composto por " + digits + " digito(s)");
    }

    public static int checkAmountOfDigits(int num) {
        // Não gostei do nome dessa variável
        int reducingNumber = num / 10;

        int digits = 1;
 
        while (reducingNumber != 0) {
         digits++;
         // Foi bonzinho passando essa lógica, acho que eu não ia me ligar
         reducingNumber /= 10;
        }

        return digits;
    }
}