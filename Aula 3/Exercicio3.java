import java.util.Scanner;

public class Exercicio3 {
    public static void exercise1() {
        /*
         * 1. Implemente um programa que solicita dois números ao usuário e exibe na tela:
         * a) A soma destes dois números
         * b) A subtração destes dois números
         * c) A multiplicação destes dois números
         * d) A divisão destes dois números
         * e) A divisão inteira destes dois números
         * f) O resto da divisão inteira destes dois números
         * g) A exponenciação destes dois números
         * h) O maior destes dois números
         * i) O menor destes dois números
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double num1 = scan.nextDouble();
        System.out.println("Digite outro número:");
        double num2 = scan.nextDouble();

        System.out.println("multiplicação: " + (num1 + num2));
        System.out.println("subtração: " + (num1 - num2));
        System.out.println("multiplicação: " + (num1 * num2));
        System.out.println("divisão: " + (num1 / num2));
        System.out.println("divisão inteira: " + ((int) num1 / (int) num2));
        System.out.println("resto: " + (num1 % num2));
        System.out.println("exponenciação: " + (Math.pow(num1, num2)));
        System.out.println("maior: " + (Math.max(num1, num2)));
        System.out.println("menor: " + (Math.min(num1, num2)));
             
        scan.close();
    }

    public static void exercise2() {
        /*
         * 2. Solicite um número ao usuário. Sendo este número uma temperatura em graus Celsius, 
         * faça um programa que converte esta temperatura para graus Fahrenheit e
         * exibe o resultado na tela. Fahrenheit = Celsius * 1.8 + 32
         */
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius:");
        int temperature = scan.nextInt();

        double convertedTemperature = temperature * 1.8 + 32;

        System.out.println("A conversão em Fahrenheit fica: " + convertedTemperature);
     
        scan.close();
    }

    public static void exercise3() {
        /*
         * 3. Solicite um número ao usuário. Sendo este número uma temperatura em graus Fahrenheit,
         * faça um programa que converte esta temperatura em graus Celsius e
         * exibe o resultado na tela. Celsius = (Fahrenheit - 32) / 1.8
         */
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Fahrenheit:");
        double temperature = scan.nextDouble();

        double convertedTemperature = (double) (temperature - 32) / 1.8;

        System.out.println("A conversão em Fahrenheit fica: " + String.format("%.2f", convertedTemperature));
             
        scan.close();
    }

    public static void exercise4() {
        /*
         * 4. Implemente um programa que solicita um número ao usuário.
         * Sendo este número uma velocidade em km/h, faça um programa
         * para converter esta velocidade em m/s e exiba o resultado na tela.
         */
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma velocidade em km/h:");
        int speed = scan.nextInt();

        double convertedSpeed = speed * 3.6;

        System.out.println("A conversão em m/s fica: " + String.format("%.2f", convertedSpeed));
             
        scan.close();
    }

    public static void exercise5() {
        /*
         * 5. Implemente um programa que solicita ao usuário o preço
         * de um calçado e o percentual de desconto. Em seguida,
         * calcule o valor do desconto e o valor final a ser
         * pago pelo calçado, mostrando os valores na tela
         */
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço de um calçado:");
        double fullPrice = scan.nextDouble();
        System.out.println("Digite percentual de desconto:");
        int discountPercentage = scan.nextInt();

        double discount = ((double) discountPercentage / 100) * fullPrice;
        double finalPrice = fullPrice - discount;

        System.out.println("Desconto: " + String.format("%.2f", discount));
        System.out.println("Preço final: " + String.format("%.2f", finalPrice));
             
        scan.close();
    }

    public static void exercise6() {
        /*
         * 6. Desenvolva um programa que solicite ao usuário
         * a altura e a largura de um retângulo e exiba o perímetro
         * e a área deste retângulo na tela.
         */
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo:");
        double height = scan.nextDouble();
        System.out.println("Digite a largura d retângulo:");
        double width = scan.nextDouble();

        double perimeter = height * 2 + width * 2;
        double area = height * width;

        System.out.println("Perímetro: " + String.format("%.2f", perimeter));
        System.out.println("Área: " + String.format("%.2f", area));
             
        scan.close();
    }

    public static void exercise7() {
        /*
         * 7. Desenvolva um programa que solicite ao usuário a base
         * e a altura de um triângulo e exiba o valor da área deste
         * triângulo na tela.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo:");
        double height = scan.nextDouble();
        System.out.println("Digite a largura do triângulo:");
        double width = scan.nextDouble();

        double area = height * width / 2;

        System.out.println("Área: " + String.format("%.2f", area));     

        scan.close();
    }

    public static void exercise8() {
        /*
         * 8. Desenvolva um programa que solicite dois números ao usuário
         * e que exiba o resultado do primeiro número elevado ao segundo,
         * ou seja, potência.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scan.nextDouble();

        double power = Math.pow(num1, num2);

        System.out.println("Potência: " + String.format("%.2f", power));
     
        scan.close();
    }

    public static void exercise9() {
        /*
         * 9. Desenvolva um programa que solicite dois números ao usuário.
         * Estes números são os catetos de um triângulo retângulo.
         * Sendo assim, apresente ao usuário:
         * a) Hipotenusa
         * b) Perímetro
         * c) Área
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro cateto:");
        double cathetus1 = scan.nextDouble();
        System.out.println("Digite o segundo cateto:");
        double cathetus2 = scan.nextDouble();

        double sumOfCatethusPowers = Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2) ;
        double hypotenuse = Math.sqrt(sumOfCatethusPowers);
        double perimeter = cathetus1 + cathetus2 + hypotenuse;
        double area = cathetus1 * cathetus2 / 2;

        System.out.println("Hipotenusa: " + String.format("%.2f", hypotenuse));
        System.out.println("Perímetro: " + String.format("%.2f", perimeter));
        System.out.println("Área: " + String.format("%.2f", area));

        scan.close();
    }

    public static void main(String[] args) {
        double num1 = 8.9;

        System.out.println(num1);

        // System.out.println("PS: vc pode comentar os exercícios pra ficar mais fácil de visualizar");

        // System.out.println("================== EXERCÍCIO 1 ==================");
        // exercise1();
         
        // System.out.println("\n\n================== EXERCÍCIO 2 ==================");
        // exercise2();
        
        // System.out.println("\n\n================== EXERCÍCIO 3 ==================");
        // exercise3();
        
        // System.out.println("\n\n================== EXERCÍCIO 4 ==================");
        // exercise4();
        
        // System.out.println("\n\n================== EXERCÍCIO 5 ==================");
        // exercise5();
        
        // System.out.println("\n\n================== EXERCÍCIO 6 ==================");
        // exercise6();
        
        // System.out.println("\n\n================== EXERCÍCIO 7 ==================");
        // exercise7();
        
        // System.out.println("\n\n================== EXERCÍCIO 8 ==================");
        // exercise8();
        
        // System.out.println("\n\n================== EXERCÍCIO 9 ==================");
        // exercise9();
    }    
}
