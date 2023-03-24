import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{ // criando o map, dizendo o TIPO da chave e o VALOR
            put("gol", 14.4); //semelhante ao add, mas em Map é put
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        String x = "";
        System.out.println(carrosPopulares.toString());
        System.out.println("\n");

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2); //HashMap pode alterar valores
        System.out.println(carrosPopulares);
        System.out.println("\n");

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson")); // contains key verifica se algo esta no Map
        System.out.println("\n");

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno")); // aqui o get só mostra o VALOR pois o uno é como se fosse a chave que abre a gaveta é pega o valor
        System.out.println("\n");
//        System.out.println("Exiba o terceiro modelo adicionado: "); // n existem em HashMap um jeito q eu possa mostrar especificadamente algo

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); // como o modelo é nossa chave de entrada no Map, é só mostrar essa chave, no caso o keySet
        System.out.println(modelos);
        System.out.println("\n");

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values(); // da mesma forma que em cima, so que mostra os valores.
        System.out.println(consumos);
        System.out.println("\n");

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); // retorna nosso maior valor
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();  //crio um entry
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) { //comparo pra ver se o maior value que esta em max  é igual ou maior que o MAX
                modeloMaisEficiente = entry.getKey(); //a variavel recebe o maior q esta em entry
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("\n");

        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());//retorna nosso menor valor
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) { //comparo pra ver se o menor value que esta em max  é igual ou menor que o MAX
                modeloMenosEficiente = entry.getKey(); //a variavel recebe o menor que esta em Entry
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator(); // crio um iterator
        Double soma = 0d;
        while(iterator.hasNext()){ // verifico se meu colletions tem proximo
            soma += iterator.next(); // se tem, somo ele na variavel SOMA
        }
        System.out.println("\n");

        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("\n");

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size())); // size é o tamanho do meu map

        System.out.println(carrosPopulares);
        System.out.println("\n");

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator(); //iterator novvo 
        while(iterator1.hasNext()){ // se tiver proximo eu vou passar pro proximo
            if(iterator1.next().equals(15.6)) iterator1.remove(); // se esse proximo for igual a 15.6, eu uso o remove.
        }
        System.out.println(carrosPopulares);
        System.out.println("\n");

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{ // linkedhashmap sempre mostra em ordem, só fazer um novo map
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());
        System.out.println("\n");

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1); //Treemap que ordena as coisas, criamos um novo, mas o parametro são os Carrospopulares1 , criado em cima
        System.out.println(carrosPopulares2.toString());
        System.out.println("\n");

        System.out.println("Apague o dicionario de carros");
        carrosPopulares.clear(); // clear apaga 
        System.out.println("\n");

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty()); //is empty verifica se ta vazio
    }
}
