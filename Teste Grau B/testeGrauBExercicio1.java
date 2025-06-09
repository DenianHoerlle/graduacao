public class testeGrauBExercicio1 {
    /*
     * Na sua função main, crie 2 vetores de números inteiros, com o mesmo tamanho, e os passe como
     * parâmetro para uma função chamada produtoEscalar. Essa função deverá performar os passos
     * necessários e retornar o inteiro correspondente ao valor do produto escalar.
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        
        System.out.println("O produto escalar entre os dois vetores é " + produtoEscalar(array1, array2));
    }
    
    public static int produtoEscalar(int[] primeiroArray, int[] segundoArray) {
        int total = 0;
        
        for(int i = 0; i < primeiroArray.length; i++) {
            total += primeiroArray[i] * segundoArray[i];
        }
        
        return total;
    }
}