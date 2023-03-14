import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        Stack <Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("Chevrolet"));

        System.out.println(stackCarros);
        System.out.println("\n");
        System.out.println(stackCarros.pop());
        System.out.println("\n");
        System.out.println(stackCarros);
        System.out.println("\n");
        System.out.println(stackCarros.peek());
        System.out.println("\n");
        System.out.println(stackCarros);
        System.out.println("\n");
        System.out.println(stackCarros.isEmpty());
    }
}
