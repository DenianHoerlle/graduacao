import java.util.Scanner;

public class testeGrauBExercicio0 {
        /*
         * Na sua função main, crie dois arde 7 posições, 
         * chamados array1 e array2. Ambos devem ter todos seus elementos
         * lidos do teclado. Após isso, crie uma função chamada verificaIgualdade
         * que recebe ambos os arrays como parâmetro e retorne true caso ambos
         * sejam iguais, ou false caso sejam diferentes.
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[7];
        int[] array2 = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Insira o valor da posição " + i + " do primeiro array");
            array1[i] = scan.nextInt();
            System.out.println("Insira o valor da posição " + i + " do segundo array");
            array2[i] = scan.nextInt();
        }

        System.out.println("Os arrays são iguais? " + verificaIgualdade(array1,array2));
    }
    
    public static boolean verificaIgualdade(int[] primeiroArray, int[] segundoArray) {
        for (int i = 0; i < primeiroArray.length; i++) {
            if (primeiroArray[i] != segundoArray[i]) return false;
        }        
        
        return true;
    }
    
}