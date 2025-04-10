import java.util.Scanner;

public class aula06_calcSimples {
    /*
     * Sua função main deverá chamar duas funções: sendo elas:
     * leTresInteiros, que não recebe nenhum parâmetro e
     * solicita que o usuário digite três valores inteiros
     * e os guarda em 3 variáveis diferentes.
     * Essa função deverá invocar uma outra função chamada
     * calculadora(), que recebe 4 parâmetros, sendo eles
     * os 3 valores lidos na função leTresInteiros() e
     * um String contendo uma das 4 operações(+, -, * e /).
     * Sua calculadora deverá então performar a operação passada como parâmetro e printar o resultado.
     */
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        // String inputedString = scan.nextLine();

        // System.out.println(inputedString.equals("+"));

        leTresInteiros();

    }

    public static void leTresInteiros() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = scan.nextInt();
        scan.nextLine();  // Consume left over newline

        String operador = getOperador(scan);

        calculadora(num1, num2, num3, operador);
    }

    public static String getOperador(Scanner scan) {
        System.out.println("Digite um operador entre as opções(+, -, *, /): \n");

        String operador = scan.nextLine();

        boolean isOperatorValid = isOperatorValid(operador);

        while (isOperatorValid == false) {
            System.out.println("Digite um dos operadores (+, -, *, /)! ");
            operador = scan.nextLine();
            isOperatorValid(operador);
        }

        System.out.println("passou do while");

        return operador;

    }

    public static boolean isOperatorValid(String operador) {
        if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
            return true;
        }

        return false;
    }

    public static void calculadora(int num1, int num2, int num3, String operador) {
        if (operador == "+") {
            System.out.println(num1 + num2 + num3);
        }
    }
    
}
