import java.util.Scanner;

public class exercicio1Aula11 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia a largura e a altura de um retângulo. Em seguida, crie um método chamado
         * calculaArea que recebe ambos os valores como parâmetro, e retorna a área desse retângulo, a qual também
         * deverá ser um número real.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo:");
        double largura = Math.abs(scan.nextDouble());
        System.out.println("Digite a altura do retângulo:");
        double altura = Math.abs(scan.nextDouble());

        System.out.println("A área do retângulo é " + calculaArea(largura, altura));
    }

    public static double calculaArea(double largura, double altura) {
        return largura * altura;
    }
}
