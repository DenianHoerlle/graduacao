import java.util.Scanner;

public class exercicio3Aula11 {
    public static void main(String[] args){
    /*
     * Escreva um programa que leia o peso (em kg, ou seja, double) e a altura (em metros, ou seja, double também)
     * de uma pessoa, calcule o Índice de Massa Corporal (IMC) numa função chamada calculaIMC e retorne esse valor.
     */

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Insira seu peso(kg): ");
    double peso = scan.nextDouble();
    System.out.println("Insira sua altura(m): ");
    double altura = scan.nextDouble();

    System.out.println("Seu IMC é: " + calculaIMC(peso, altura));
    }

    public static double calculaIMC(double peso, double altura) {
        // Formula usada: imc = peso / altura²
        return peso / (altura*altura);
    }
}
