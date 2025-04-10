import java.util.Scanner;


public class Aula03 {
    
    public static void main(String[] args) {
        
        /*
         * OPERADORES ARITMÉTICOS:
         * Adição: +
         * Subtração: -
         * Multiplicação: *
         * Divisão: /
         * Divisão, retorna resto: % (mod ou módulo)
        */
        System.out.println("ARITMÉTICA BÁSICA\nVamos calcular a Aritmética Básica de 2 números!!!\n\n");
        
        Scanner scan = new Scanner(System.in);        
        // System.out.println("Digite o primeiro número: ");
        // int num1 = scan.nextInt();
        // System.out.println("Digite o segundo número: ");
        // int num2 = scan.nextInt();
        
        // System.out.println(String.format("A soma de %d + %d = %d", num1, num2, (num1 + num2)));
        // System.out.println(String.format("A subtração de %d - %d = %d", num1, num2, (num1 - num2)));
        // System.out.println(String.format("A multiplicação de %d * %d = %d", num1, num2, (num1 * num2)));
        // System.out.println(String.format("A divisão de %d / %d = %d", num1, num2, (num1 / num2)));
        // System.out.println(String.format("O resto da divisão de %d mod %d = %d", num1, num2, (num1 % num2)));
        
        /*
         * OPERADORES DE ATRIBUIÇÃO:
         * Atribuição: =
         * Atribuição subtraída: -=
         * Atribuição somada: +=
         * Atribuição multiplicada: *=
         * Atribuição divisível: /=
         * 
         * 
        */
         // double pi = 3.14;
         // pi -= 1.07;
         // pi -= 1.07;
         // System.out.println(String.format("%.2f", pi));
         // pi += 10.99;
         // System.out.println(String.format("%.2f", pi));
         // pi /= 0.69;
         // System.out.println(String.format("%.2f", pi));
         // pi *= 14;
         // System.out.println(String.format("%.2f", pi));      
       
         /*
          * FUNÇÕES MATEMÁTICAS:
          * Valor absoluto:         Math.abs();
          * Valor máximo:           Math.max();
          * Valor mínimo:           Math.min();
          * Potenciação:            Math.pow();
          * Arredonda pra cima:     Math.ceil();
          * Arredonda pra baixo:    Math.floor();
          * Arredonda:              Math.round();
          * Constante PI:           Math.PI;
          * Constante e:            Math.E;
          * 
        */
         // double numGrande = 9.9999;
         // double numPequenino = 0.3109;
         // System.out.println("Valor absoluto de -3:\t\t\t" + Math.abs(-3));
         // System.out.println("Valor máximo entre 9.9999 e 0.3109:\t" + Math.max(numGrande, numPequenino));
         // System.out.println("Valor mínimo entre 9.9999 e 0.3109:\t" + Math.min(numGrande, numPequenino));
         // System.out.println("2 elevado a 5:\t\t\t\t" + Math.pow(2, 5));
         // System.out.println("Valor de 0.3109 arredondado para cima:\t" + Math.ceil(numPequenino));
         // System.out.println("Valor de 9.9999 arredondado para baixo:\t" + Math.floor(numGrande));
         // System.out.println("Valor de 9.9999 arredondado:\t\t" + Math.round(numGrande));
         // System.out.println("Pi:\t\t\t\t\t" + Math.PI);
         // System.out.println("e:\t\t\t\t\t" + Math.E);
         
         
         /* CASTING OU CONVERSÃO DE TIPOS
          * int x = 14;
          * (double) x ---> Converterá x de inteiro para double
          * 
          * double y = 3.14;
          * (int) y ---> TENTARÁ converter y de double para inteiro
        */
         // int x = 14;
         // System.out.println((double) x);
         
         // double y = 3.99;
         // System.out.println((int) y);
         
         // double nota1 = 10;
         // double nota2 = 8.3;
         // double nota3 = 9.7;
         // int qtAlunos = 3;
         // double notaMedia = (nota1 + nota2 + nota3) / (double) qtAlunos;
         // System.out.println(String.format("A nota média da turma foi de: %.2f", notaMedia));
         
         // Calculando porcentagem
         // int maximoPontos = 500;
         // int pontuacaoPlayer = 423;
         // System.out.println((((double) pontuacaoPlayer / maximoPontos) * 100) + "%");

    }
}