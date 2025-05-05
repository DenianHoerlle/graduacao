import java.util.Scanner;

public class TesteExercicio1 {
    /* 
     * Na função main, peça para o usuário 2 números inteiros positivos (num1 e num2) e passe eles como
     * parâmetro para uma função, a qual deverá imprimir na tela todos os números primos existentes entre o
     * primeiro número digitado e o segundo (ambos números inclusos).
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num1 = Math.abs(scan.nextInt());
        System.out.println("Digite outro número inteiro positivo: ");
        int num2 = Math.abs(scan.nextInt());

        // Faz a verificação que determina qual variável representa o início do intervalo e qual determina o fim dele.
        if (num1 <= num2) {
            identifyPrimeNumbersInRange(num1, num2);
        } else {
            identifyPrimeNumbersInRange(num2, num1);
        }
    }

    public static void identifyPrimeNumbersInRange(int rangeStart, int rangeEnd) {
        System.out.println("Os números primos entre " + rangeStart + " e " + rangeEnd + " são:");

        for (int count = rangeStart; count <= rangeEnd; count++) {
            // Criada outra função pq for dentro de for dá nó na cabecinha
            if (checkIfIsPrimeNumber(count)) {
                System.out.println(count);
            }
        }
    }

    public static boolean checkIfIsPrimeNumber(int num) {
        // Numero inteiro e menor que 4 só pode ser 1, 2 ou 3 todos primos
        if (num <= 3) return true;

        // Esse for começa do 2 porque todo número primo é divisível por 1
        for (int count = 2; count < num; count ++) {
            // Vamos descobrir na força bruta :)
            if (num % count == 0) {
                return false;
            }
        }

        return true;
    }
    
}
