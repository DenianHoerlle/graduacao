import java.util.Scanner;

public class TesteExercicio3 {
    /*
     * Vamos calcular a soma de uma série de números compostos pelo número 3. Para isso, no seu bloco
     * main, peça para o usuário digitar um número inteiro positivo qualquer (n) e passe esse número como
     * parâmetro para uma função, a qual deverá imprimir da seguinte maneira:
     * "A soma da sequência de números compostos por 3, indo até 2 dígitos é: 36"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Se digitar 10 dá overflow :]
        System.out.println("Digite um número inteiro positivo: ");
        int num = scan.nextInt();

        sumWithThree(num);
    }

    // não gostei do nome da função
    public static void sumWithThree(int num) {
        int currentMultiplier = 0;
        int currentPotency = 1;
        int total = 0;

        // Acho que esse for ficou meio complicado
        for (int count = 1; count <= num; count ++) {
            currentMultiplier += 3 * currentPotency;
            total += currentMultiplier;

            currentPotency *= 10;
        }

        System.out.println("A soma da sequência de números compostos por 3, indo até " + num + " dígitos é: " + total);
    }
}
