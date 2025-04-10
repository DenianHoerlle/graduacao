import java.util.Scanner;

public class aula4 {
    public static void comparisonOperators() {
        /*
         - OPERADORES DE COMPARAÇÃO
         - == -> Verifica se o valor da esquerda é igual ao da direita
         - != -> Verifica se o valor da esquerda é diferente do da direita
         - >  -> Verifica se o valor da esquerda é maior que o da direita
         - <  -> Verifica se o valor da esquerda é menor que o da direita
         - >= -> Verifica se o valor da esquerda é maior ou igual o da direita
         - <= -> Verifica se o valor da esquerda é menor ou igual o da direita
         */

         int x = 10;
         int y = 15;

         System.out.println("10 == 15: " + (x == y)); // false
         System.out.println("10 != 15: " + (x != y)); // true
         System.out.println("10 > 15: " + (x > y)); // false
         System.out.println("10 < 15: " + (x < y)); // true
         System.out.println("10 >= 15: " + (x >= y)); // false
         System.out.println("10 <= 15: " + (x <= y)); // true
    }

    public static void logicOperators() {
       /*
        - OPERADORES LÓGICOS
        - && -> Equivale ao "e" lógica. Ambos lados precisam ser verdadeiros
        - || -> Equivale ao "ou" lógico. Ao menos um lado da equação precisa ser verdadeira
        - !  -> Equivale ao "~" ou "¬" lógico. Inverte o valor seguinte
        */
       
        Scanner scan = new Scanner(System.in);

        System.out.println("¬false" + !false);
        System.out.println("¬true" + !true);

        System.out.println("Digite a primeira nota");
        int score1 = scan.nextInt();

        System.out.println("Digite a segunda nota");
        int score2 = scan.nextInt();

        System.out.println("score1 && score2 >= 6: " + (score1 >= 6 && score2 >= 6));
        System.out.println("score1 || score2 == 10: " + (score1 == 10 && score2 == 10));



        scan.close();
    }

    public static void selectionStructure() {
        /*
         - ESTRUTURA DE SELEÇÃO - IF/ELSE
         - Se lê "Se alguma coisa é verdadeira, então faço algo.
         - Senão, se outra coisa é verdadeira, faço outro algo.
         - Senão, faço outro algo."
         - A sintaxe é:
         if (equação booleana) {
            // bloco de código
         } else if (outra equação booleana) { // opcional
            // bloco de código 
         } else { // opcional
            // bloco de código 
         }
         */

        Scanner scan = new Scanner(System.in);

        int guessNumber = 2;
        System.out.println("Adivinhe qual número estou pensando");

        int guessedNumber = scan.nextInt();

        if (guessedNumber == guessNumber) {
            System.out.println("Acertou!");
        } else if (guessedNumber == 3 || guessedNumber == 1) {
            System.out.println("Quase!");
        } else {
            System.out.println("Errou!");
        }

        scan.close();
    }

    public static void ifelseExample() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int age = scan.nextInt();
        if (age <= 0) {
            System.out.println("Você não existe");
        } else if (age <= 18) {
            System.out.println("Você não pode dirigir");
        } else if (age > 18 && age <= 64) {
            System.out.println("Dirija com cuidade");
        } else {
            System.out.println("Sai da estrada, vovô!");
        }
    }

    public static void selectionStructureSwitch() {
        /*
         * ESTRUTURA DE SELEÇÃO - SWITCH
         * A partir de uma variável ou equação, itera sobre possibilidades.
         * A sintaxe é:
         * switch (equação ou variável) {
         *   case valor:
         *     bloco de código
         *     break;
         *   case valor:
         *     bloco de código
         *     break;
         *   case outro valor:
         *     bloco de código
         *     break;
         *   case outro outro valor:
         *     bloco de código
         *     break;
         *   default: // "default" é igual o else
         *     bloco de código
         * }
         * 
         */

         Scanner scan = new Scanner(System.in);

         System.out.println("Digite um valor numérico de um dia da semana");

         int dayOfTheWeek = scan.nextInt();

         switch (dayOfTheWeek) {
             case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido");
         }
    }

    public static void main (String[] args) {
        // comparisonOperators();
        // logicOperators();
        // selectionStructure();
        // ifelseExample();
        // selectionStructureSwitch();
    }
}
