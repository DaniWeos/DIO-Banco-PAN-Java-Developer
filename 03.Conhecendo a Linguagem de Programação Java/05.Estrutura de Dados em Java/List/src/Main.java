import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Carro> listCarro = new ArrayList<>();

        listCarro.add(new Carro("Ford"));
        listCarro.add(new Carro("Chevrolet"));
        listCarro.add(new Carro("Fiat"));
        listCarro.add(new Carro("Peugeot"));
        
        System.out.println(listCarro.contains(new Carro ("Ford"))); //vendo se existe o carro Ford
        System.out.println("\n");
        System.out.println(listCarro.get(2)); //pegando o que ta em indice 2
        System.out.println("\n");
        System.out.println(listCarro.indexOf(new Carro("Fiat")));//retorna qual indice esta o fiat
        System.out.println("\n");
        System.out.println(listCarro.remove(3)); //removo o que esta no indice 3
        System.out.println("\n");
        System.out.println(listCarro);
        System.out.println("\n");
}
}
