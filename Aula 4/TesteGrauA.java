import java.util.Scanner;

public class TesteGrauA {
    public static void exercise1() {
        // 1 - Solicite um numero inteiro e imprima na tela se ele é par ou impar.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        
        int n = scan.nextInt();
        String nType = "impar";

        if (n % 2 == 0) {
            nType = "par";
        } 
        
        System.out.println("O número informado é " + nType);
    }

    public static void exercise2() {
        // 2 - Solicite dois números inteiros "a" e "b" e imprima na tela se o primeiro é perfeitamente divisível pelo segundo, sem gerar resto.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int a = scan.nextInt();

        System.out.println("Digite outro número inteiro");
        int b = scan.nextInt();

        String isDivisibleText = "é";

        if (a % b != 0) {
            isDivisibleText = "NÃO é";
        } 
        
        System.out.println("O primeiro número " + isDivisibleText + " perfeitamente divisível pelo segundo número");
    }

    public static void exercise3() {
        // 3 - Solicite dois números inteiros "a" e "b" e imprima na tela se o resultado da subtração entre eles (a - b)
        // resulta em um número positivo ou um número negativo. Considere o zero como positivo.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int a = scan.nextInt();

        System.out.println("Digite outro número inteiro");
        int b = scan.nextInt();

        String resultPolarity = "positivo";

        if (a - b < 0) {
            resultPolarity = "negativo";
        }
        
        System.out.println("O resultado da subtração é um número " + resultPolarity);
    }

    public static void exercise4() {
        // 4 - Solicite três números, sendo que os dois últimos representam, respectivamente, o valor inicial e final de um intervalo.
        // Mostre uma mensagem informando se o primeiro número digitado está abaixo, dentro ou acima do intervalo.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        double number = scan.nextDouble();

        System.out.println("Digite o ínicio do intervalo");
        double intervalStart = scan.nextDouble();
        System.out.println("Digite o fim do intervalr");
        double intervalEnd = scan.nextDouble();

        String numberIntervalRelativity;

        if (number < intervalStart) {
            numberIntervalRelativity = "abaixo";
        } else if (number >= intervalStart && number <= intervalEnd) {
            numberIntervalRelativity = "dentro";
        } else { // number > intervalEnd
            numberIntervalRelativity = "acima";
        }

        System.out.println("O primeiro número digitado está " + numberIntervalRelativity + " do intervalo");
    }

    public static void exercise5() {
        // 5 - Solicite um número inteiro representando uma temperatura em graus Celsius.
        // Imprima na tela se nessa temperatura a água se encontra em estado sólido, líquido ou gasoso(acima de 100).

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura da água em Celsius");
        int temperature = scan.nextInt();

        String waterState;

        if (temperature <= 0) {
            waterState = "sólido";
        } else if (temperature > 0 && temperature < 100) {
            waterState = "líquido";
        } else { // temperature >= 100
            waterState = "gasoso";
        }

        System.out.println("A água, nessa temperatura, se encontra no estado " + waterState);
    }

    public static void main(String[] args) {
        System.out.println("==============/ Exercício 1 /==============");
        exercise1();

        System.out.println("\n\n==============/ Exercício 2 /==============");
        exercise2();

        System.out.println("\n\n==============/ Exercício 3 /==============");
        exercise3();

        System.out.println("\n\n==============/ Exercício 4 /==============");
        exercise4();
        
        System.out.println("\n\n==============/ Exercício 5 /==============");
        exercise5();
    }
    
}
