public class Main {
    public static void main(String[] args) throws Exception {

        Fila <String> minhaFila = new Fila<>(); //agora apenas strings

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Daniel");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Julia");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

    }
}
