import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        Queue <Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Chevrolet"));
        queueCarro.add(new Carro("Fiat"));


        System.out.println(queueCarro.isEmpty());
        System.out.println("\n");
        System.out.println(queueCarro);
        System.out.println("\n");
        System.out.println(queueCarro.add(new Carro("Peugeot")));
        System.out.println("\n");
        System.out.println(queueCarro);
        System.out.println("\n");
        System.out.println(queueCarro.offer(new Carro("Renault")));
        System.out.println("\n");
        System.out.println(queueCarro);
        System.out.println("\n");
        System.out.println(queueCarro.peek());
        System.out.println("\n");
        System.out.println(queueCarro);
        System.out.println("\n");
        System.out.println(queueCarro.poll());
        System.out.println("\n");
        System.out.println(queueCarro);

        }
}
