import java.util.Scanner;

public class testeGrauBExercicio2 {
    /*
     * Na sua função main, peça para o usuário digitar a quantidade de posições que deseja em um array e
     * leia este número inteiro do teclado. Após isso, crie um array de Strings chamado sentencas com este
     * tamanho digitado pelo usuário, e leia todos os elementos via teclado. Após, invoque uma função
     * chamada verificaMaiorSentenca que recebe este array como parâmetro. Esta função deverá iterar sobre
     * todas as sentenças contidas no array e, ao final, imprimir em tela qual a sentença com o maior número
     * de caracteres, e a quantia de caracteres desta sentença
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de sentenças que você deseja inserir ");
        int tamanho = scan.nextInt();
        scan.nextLine();
        
        String[] sentencas = new String[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite a sentença que vai ser inserida na posição " + i + " do array");
            sentencas[i] = scan.nextLine();
        }       
        
        verificaMaiorSentenca(sentencas);
    }
    
    public static void verificaMaiorSentenca(String[] sentencas) {
        String maiorFrase = "";
        
        for (int i = 0; i < sentencas.length; i++) {
            if (sentencas[i].length() > maiorFrase.length()) maiorFrase = sentencas[i];
        }        
        
        System.out.println("A maior sentença é \"" + maiorFrase + "\" e possui " + maiorFrase.length() + " caracteres");
    }
}
