import java.util.Scanner;

public class aula05 {
    public static void forExample() {
        /*
         * ESTRUTURA DE REPETIÇÃO - FOR
         * Serve para repertimos um bloco de código um número específico de vezes.
         * Normalmente, faz uso de uma variável controladora, que se encarrega de contar o número de execuções do loop for.
         * Essa variável contadora costuma se chamar 1, e ser incrementada a cada iteração.
         * A sintaxe de um loop for simples é 
         *  for (int i = 0; i < algumNumero; i++) {
         *      // Bloco de código
         *  }
         */

         for (int i = 0; i <= 10; i++) {
            System.out.print(i + " -> ");
         }

         System.out.println("");

         for (int i = 0; i <= 100; i+=10) {
            System.out.print(i + " -> ");
         }
         
         System.out.println("");

         for (int i = 100; i >= 0; i-=25) {
            System.out.print(i + " -> ");
         }
    }

    public static void forExample2() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número para ser usado como tabuada");

        int tabuada = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

    }

    public static void forExample3() {
        // imprime de 1 a 10, com exceção do valor 3, usando if
        for (int i = 0; i <=10; i++) {
            if (i != 3) {
                System.out.print(i + " -> ");
            }
        }
    }

    public static void forExample4() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j<= 5; j++) {
                System.out.println("\tValor de j: " + j);
            }
        }
    }

    public static void whileExample() {
        /*
         * ESTRUTURA DE REPETIÇÃO - WHILE
         * Serve pra repetir um bloco de código enquanto uma condição for verdadeira.
         * Também permitirá, assim como um FOR, a execução de um bloco de código
         * por um número específico de vezes, fazendo uso de uma variável contadora.
         */

        int i = 0;

         while (i <= 10) {
            System.out.println(i);
            i ++;
         }

         i = 100;
         
         while (i >= 1) {
            if (i == 70) {
                continue;
            }

            System.out.println(i);
            i--;
         }


    }

    public static void whileExample2() {
        Scanner scan = new Scanner(System.in);

        int correctNumber = 42;
        
        System.out.println("Adivinhe o número!");

        int guess = scan.nextInt();

        while (guess != correctNumber) {
            System.out.println("Errado! Tente novamente: ");
            guess = scan.nextInt();

            if (guess == correctNumber) {
                System.out.println("Acertou!!");
                break;
            }
        }


    }

    public static void main(String[] args) {
        forExample();
        forExample2();
        forExample3();
        forExample4();

        whileExample();
        whileExample2();
    }
}

// {\___/}
// ( ^_^ )
//  |>♥<|