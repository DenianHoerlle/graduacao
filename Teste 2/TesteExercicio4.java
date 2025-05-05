import java.util.Scanner;

public class TesteExercicio4 {
    /*
     * Na função main, peça para o usuário digitar um número inteiro positivo qualquer (n) e passe esse
     * número como parâmetro para uma função denominada somar_inversa(n), a qual retorna o resultado
     * da seguinte soma: 1/1 + 1/2 + 1/3 + ... + 1/n. Imprima o resultado no bloco main.
     * Exemplo de saida: 
     * "O resultado da soma de 1/1 + 1/2 + 1/3 + 1/4 + 1/5 é: 2.283333333"
     * ============================/ OBS: \============================
     * Será atribuído 0.5pts extras para aqueles que conseguirem imprimir exatamente como
     * mostrado nos exemplo, ao invés de apenas o resultado numérico da soma.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo");
        int num = Math.abs(scan.nextInt());

        double total = somar_inversa(num);
        // Não curti o nome dessa variável
        String fractionsText = quantidade_de_somas(num);

        System.out.println("O resultado da soma de " + fractionsText + " é: " + total);
    }

    public static String quantidade_de_somas(int num) {
        String fractionsText = "1/1";

        // Seria muito mais performático fazer usando um for, mas como o enunciado fala explicitamente pra imprimir
        // o resultado na main(), tem que iterar 2 vezes
        for (int count = 2; count <= num; count++) {
            fractionsText += " + 1/" + count;
        }

        return fractionsText;
    }

    public static double somar_inversa(int num) {
        double total = 1;

        for (int count = 2; count <= num; count++) {
            total += 1.0/count;
        }

        return total;
    }
}

// SOrvete :P

//       o
//      (~)
//     (~ ~)
//    (~ ~ ~)
//   (~ ~ ~ ~)
//    \vvvvv/
//     \vvv/
//      \v/
//       V

// Eu faço piada quando to nervoso