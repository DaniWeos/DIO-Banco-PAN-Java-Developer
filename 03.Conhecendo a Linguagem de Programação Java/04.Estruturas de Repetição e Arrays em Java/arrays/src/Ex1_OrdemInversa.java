public class Ex1_OrdemInversa {

    /*
     * Criar um vetor de 6 numeros inteiros e mostre na ordem inversa.
     */
    public static void main(String[] args) throws Exception {

        int[] vetor = { 1, 2, 3, 4, 5, 6 };

        int count = 0;

        System.out.println("Vetor: ");
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor inverso: ");
        for(int i = (vetor.length-1); i >= 0; i--){
        System.out.print(vetor[i] + " ");
        }


    }
}
