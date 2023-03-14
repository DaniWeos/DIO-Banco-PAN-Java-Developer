import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import javax.print.attribute.HashAttributeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros); //imprime fora de ordem

        Set<Carro> treeSetCarros = new TreeSet<>();
        
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));


        System.out.println("\n");
        System.out.println(treeSetCarros);
        System.out.println("\n");

}
}