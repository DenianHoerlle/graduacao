import java.util.Scanner;

public class exercicio2Aula12 {
    /*
     * Crie um array chamado numeros contendo 8 posições, com valores 
     * lidos pelo teclado. Após, crie uma função chamada checaImpar() 
     * e passe esse array como parâmetro. Sua função checaImpar() 
     * deverá imprimir a quantidade de números ímpares contidos neste array.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insiraum numero na posição " + i);
            numeros[i] = scan.nextInt();
        }

        checaImpar(numeros);
    }

    public static void checaImpar(int[] numeros) {
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            impares++;
        }

        System.out.println("A quantidade de impares é " + impares);
    }
    
}
