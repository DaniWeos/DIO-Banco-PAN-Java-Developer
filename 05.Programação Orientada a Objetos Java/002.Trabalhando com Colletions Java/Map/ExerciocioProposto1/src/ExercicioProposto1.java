import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) throws Exception {

 /*
 Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
        Map<String, Integer> Populacao = new HashMap<>() {{ 
            put("PE",9616621); 
            put("AL",3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("População do NE atual: "+ Populacao);
        System.out.println("\n");

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        Populacao.put("RN", 3534165); //HashMap pode alterar valores
        System.out.println(Populacao);
        System.out.println("\n");

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277");
        if(Populacao.containsKey("PB")){
            System.out.println("Contém");
        }else{
            System.out.println("Não contém, adicionado!");
           Populacao.put("PB", 4039277);
           System.out.println(Populacao);
           System.out.println("\n");
        }

        System.out.println("Exibir População de PE: " + Populacao.get("PE"));

        System.out.println("Exibir na ordem que foi inserido: ");
        Map<String, Integer> Populacao1 = new LinkedHashMap<>(Populacao) {{ 
            put("PE",9616621); 
            put("AL",3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(Populacao1);
        System.out.println("\n");

        System.out.println("Exibir em ordem alfabetica: ");
        Map<String, Integer> Populacao2 = new TreeMap<>(Populacao); // Ordem natural, alfabetica, Treemap
        for (Map.Entry<String, Integer> populacao : Populacao2.entrySet());
        System.out.println(Populacao2);
        System.out.println("\n");

        Collection<Integer> populacao = Populacao.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : Populacao.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com a menor população (%s) e seu respectivo valor (%d)\n", estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n", estadoMaiorPopulacao, Collections.max(populacao));
        System.out.println("\n");


        Iterator<Integer> iterator = Populacao.values().iterator(); // crio um iterator
        Double soma = 0d;
        while(iterator.hasNext()){ // verifico se meu colletions tem proximo
            soma += iterator.next(); // se tem, somo ele na variavel SOMA
        }
        System.out.println("Soma das populaçoes: " + soma);
        System.out.println("\n");

        System.out.println("Exiba a média das populações: " + soma/Populacao.size());
        System.out.println("\n");

        System.out.println("Remova os estados com menos de 4.000.000: ");
        Iterator<Integer> iterator2 = Populacao.values().iterator(); //iterator novvo 
        while(iterator2.hasNext()){ // se tiver proximo eu vou passar pro proximo
            if(iterator2.next() <= 4000000 ) iterator2.remove(); // se esse proximo for igual a 15.6, eu uso o remove.
        }
        System.out.println(Populacao);
        System.out.println("\n");

        Populacao.clear();

        System.out.println("Verifica se o dicionario esta vazio: " + Populacao.isEmpty());

}
}