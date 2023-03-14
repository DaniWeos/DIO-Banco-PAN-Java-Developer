import java.util.Random;

public class Ex3_NumerosAleatorios {

    /*
     * Criar um programa que mostre 20 numeros aleatorios e seus sucessores.
     */
    public static void main(String[] args) throws Exception {

        Random random = new Random(); // gera numeros aleatorios
        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.print("Sucessor dos Numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1) + " ");
        }

    }
}