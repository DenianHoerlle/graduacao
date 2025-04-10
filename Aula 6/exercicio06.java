import java.util.Scanner;

public class exercicio06 {
    /*
     * Utilize o menu visto em aula para solicitar ao usuário qual
     * a opção de operação deseja fazer. Exemplo:
     * 1 - Adição
     * 2 - Subtração
     * 3 - Multiplicação
     * 4 - Divisão
     * 5 - Modulo
     * 6 - Exponenciacao
     * 9 - Sair
     * Implemente cada uma das funções e, dentro delas, solicite que o usuário digite
     * 2 números para que a operação possa ser realizada.
     */
     public static void main(String[] args) {
        int menuOption = 0;

        while(menuOption != 9) {
            menuOption = showMenu();

            switch(menuOption) {
                case 1:
                    sum();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    module();
                    break;
                case 6:
                    power();
                    break;
                case 9:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.print("\n\n");
        }
     }

     public static int showMenu() {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Escolha uma opção: ");

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Módulo");
        System.out.println("6 - Exponenciação");
        System.out.println("9 - sair ");

        return scan.nextInt();
     }

     public static double getNumber() {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Digite um número: ");

        return scan.nextDouble();
     }

     public static void sum() {
        double num1 = getNumber();
        double num2 = getNumber();

        System.out.println("Resultado: " + (num1 + num2));
     }

     public static void subtract() {
        double num1 = getNumber();
        double num2 = getNumber();

        System.out.println("Resultado: " + (num1 - num2));
     }

     public static void multiply() {
        double num1 = getNumber();
        double num2 = getNumber();

        System.out.println("Resultado: " + (num1 * num2));
     }

     public static void divide() {
        double num1 = getNumber();
        double num2 = getNumber();

        System.out.println("Resultado: " + (num1 / num2));
     }

     public static void module() {
        double num1 = getNumber();
        double num2 = getNumber();

        System.out.println("Resultado: " + (num1 % num2));
     }

     public static void power() {
        double num1 = getNumber();
        double num2 = getNumber();

        System.out.println("Resultado: " + Math.pow(num1, num2));
     }
}
