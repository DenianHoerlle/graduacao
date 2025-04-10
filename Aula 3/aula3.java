import java.util.Scanner;

public class aula3 {
  public static void arithmeticOperatorsShowcase() {
      /*
     - OPERADORES ARITMÉTICOS:
     - Adição +;
     - Subtração -;
     - Multiplicação *;
     - Divisão /;
     - Módulo %;
     - Potenciação: **
     - A precedência é 
     */

     Scanner scan = new Scanner(System.in);

     System.out.println("Vamos calcular a aritmética básica de dois números!\n\n");

     System.out.println("Digite o primeiro número\n");
     int num1 = scan.nextInt();
     System.out.println("Digite o segundo número");
     int num2 = scan.nextInt();

     System.out.println(String.format("A soma de um %d e %d é %d", num1, num2, (num1+num2)));
     System.out.println(String.format("A subtração de um %d e %d é %d", num1, num2, (num1-num2)));
     System.out.println(String.format("A multiplicação de um %d e %d é %d", num1, num2, (num1*num2)));
     System.out.println(String.format("A divisão de um %d e %d é %d", num1, num2, (num1/num2)));
     System.out.println(String.format("O módulo de um %d e %d é %d", num1, num2, (num1%num2)));

     scan.close();
  }

  public static void attributionOperatorsShowcase() {
     /*
      * OPERADORES DE ATRIBUIÇÃO:
      - Atribuição =
      - Atribuição subtraida -=
      - Atribuição somada +=
      - Atribuição multiplicada *=
      - Atribuição divisível /=
      */

      double pi = 3.14;

      pi -= 1.07;
      pi -= 1.07;
      System.out.println(String.format("%.02f", pi));
      pi += 10.99;
      System.out.println(String.format("%.02f", pi));
      pi /= 0.69;
      System.out.println(String.format("%.02f", pi));
      pi *= 0.5;
      System.out.println(String.format("%.02f", pi));
      pi = 3.0;
      System.out.println(String.format("pi agora é %.0f", pi));
  }

  public static void mathematicOperationsShowcase() {
      /*
       - FUNÇÕES MATEMÁTICAS
       - Valor absolute:      Math.abs();
       - Valor máximo:        Math.max();
       - Valor mínimo:        Math.min() ;
       - Potenciação:         Math.pow();
       - Arredonda pra cima:  Math.ceil();
       - Arredonda pra baixo: Math.floor();
       - Arredonda            Math.round();
       - Constante PI:        Math.PI;
       - Constante E:         Math.E;
       */

       double bigNumber = 9.9999999999999;
       double smallNumber = 1.00000000000001;

       System.out.println(Math.abs(-3));
       System.out.println(Math.max(smallNumber, bigNumber));
       System.out.println(Math.min(smallNumber, bigNumber));
       System.out.println(Math.pow(2, 5));
       System.out.println(Math.ceil(smallNumber));
       System.out.println(Math.floor(bigNumber));
       System.out.println(Math.round(bigNumber));
       System.out.println(Math.PI);
       System.out.println(Math.E);
  }

  public static void castingShowcase() {
    /*
     - CASTING VARIABLES
     - int x = 14;
     - (double)x ---> Convertará 'x' de inteiro para double

     - double y = 3.14;
     - (int) y ---> TENTARÁ converter 'y' de double para inteiro
     */

     int x = 14;
     System.out.println((double) x);

     double y = 3.14;
     System.out.println((int) y);

     double n1 = 10.0;
     double n2 = 8.5;
     double n3 = 9.5;
     int studentsAmount = 3;

     double averageScore = (n1 + n2 + n3) / (double) studentsAmount;

     System.out.println("A nota média da turma foi: " + String.format("%.2f", averageScore));

    //  Calculando porcentagem:

    int maxPoints = 500;
    int playerPoints = 423;
    System.out.println(String.format("%.2f", ((double) playerPoints / maxPoints) * 100 ) + "%");
  }

  public static void main(String[] args) {
    // arithmeticOperatorsShowcase();
    // attributionOperatorsShowcase();
    // mathematicOperationsShowcase();
    // castingShowcase();
  }
}