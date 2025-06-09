import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        /*
         * ARRAY:
         * Um array nada mais é do que dar UM NOME para múltiplos endereços de memória
         * Contendo dados do mesmo tipo
         * 
         * Sintaxe:
         * tipode_de_dado[] nome_do_array = {valor}
         */
        Scanner scan = new Scanner(System.in);

        String[] alunos = {"Dênian", "Michael", "Marina", "Pietro"}; // Array de 4 posições do tipo String

        double[] notas = {10, 10, 0, 10}; // Array de 4 posições do tipo double
        char[] conceitosGA = {'A', 'A', 'D', 'A'}; // Array de 4 posições do tipo char
        int[] falstasGA = {0, 0, 5, 0}; // Array de 4 posições do tipo int

        // DECLARAÇÃO COM INSTANCIAÇÃO SUBSEQUENTE
        double[] notasGB = new double[4];
        char[] conceitosGB = new char[4]; // Array de 4 posições do tipo char
        int[] falstasGB = new int[4]; // Array de 4 posições do tipo int

        // ITERA SOBRE TODO O ARRAY COM UM FOR
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno[" + i + "] = " + alunos[i]);
        }

        // INSERE VALORES DENTRO DE TODOS OS INDICES
        int[] idades = {24, 49, 26, 18, 17};
        int maisVelho = 0;
        int maisNovo = 0;

        for (int i = 0; i < alunos.length; i++) {
            if (idades[i] > maisVelho) maisVelho = idades[i];
            if (idades[i] < maisNovo) maisNovo = idades[i];
        }

        // ATRIBUI NOVOS VALORES A UM ARRAY EXISTENTE
        for (int i = 0; i < notasGB.length; i++) {
            System.out.println("Digite o nome do aluno no índice " + i);
            alunos[i] = scan.next();
            System.out.println("Digite a nota do aluno no índice " + i);
            notasGB[i] = scan.nextDouble();
        }

        for (int i = 0; i < notasGB.length; i++) {
            System.out.print("\nO aluno no índice " + i + " se chama " + alunos[i]);
            System.out.print(" e ele tirou " + notasGB[i]);
        }
    }
}
