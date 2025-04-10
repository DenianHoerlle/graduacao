import java.util.Scanner;

public class aula06 {
    public static void print(String text) {
        System.out.println(text);
    }

    public static void noParameterOrReturnExample() {
        Scanner otherScan = new Scanner(System.in);

        print("Boa noite! Qual seu nome?");

        String userName = otherScan.nextLine();

        print("Prazer em conhecê-lo, " + userName + "!");
    }

    public static void withParameterAndNoReturnExample(int num) {
        if (num % 2 == 0) {
            print(num + " é PAR!");
        } else {
            print(num + " é IMPAR!");
        }
    }

    public static double withParameterAndReturnExample(double n1, double n2, double n3) {
        double soma = n1 + n2 + n3;

        return soma;
    }

    public static int subtracIntValues(int n1, int n2, int n3) {
        return n1 - n2 - n3;
    }


    public static void functionShowcase(Scanner scan) {
        /*
         * FUNÇÕES SEM PARÂMETRO E SEM RETORNO
         * Uma função nada mais é do que um bloco de código, o qual podemos
         * dar um nome e que poderá ser invocado em diferentes 
         * partes do nosso código toda vez que o usarmos.
         * A sintaxe de uma função sem parâmetro e sem retorno é 
         * tipo_de_acesso static void nome_da_funcao() {
         *  // código
         * }
         */

        //  noParameterOrReturnExample();

         /*
          - FUNÇÕES COM PARÂMETRO E SEM RETORNO
          - Uma função pode receber dados por parâmetro.
          - Esses parâmetros devem ser passados para a função
          - quando ela é invocada, adicionando eles dentro dos parenteses.
          - A sintaze para invocar uma função com parâmetro e sem retorno é:
          - tipo_de_acesso static void nome_da_funcao(tipo_dado param1, tipo_dado param2...) {
          -  // código
          - }
          */

        // print("Digite um número para verificar se é par ou impar: ");
        // withParameterAndNoReturnExample(scan.nextInt());

        /*
         * FUNÇÕES COM RETORNO E COM PARÂMETRO
         * Caso queiramos que nossa função, após invocada e processada, nos retorne
         * um valor processado, precisamos definir qual o tipo de retorno
         * dessa função e também utilizar dentro da função a cláusua return.
         * A sintaxe para criar uma função com parâmetro e com retorno é:
         * tipo_de_acesso static tipo_do_retorno nome_da_funcao(tipo_dado param1, tipo_dado param2...) {
         *  // código
         * }
         */

         double sum = withParameterAndReturnExample(1.15, 2, 3.35);
         print("" + sum);

         print("" + subtracIntValues(10, 9, 8));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        functionShowcase(scan);

    }
}