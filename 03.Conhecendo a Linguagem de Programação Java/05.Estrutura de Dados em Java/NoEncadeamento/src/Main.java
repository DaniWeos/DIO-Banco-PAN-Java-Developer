public class Main {
    public static void main(String[] args) {


    /*
     * Exemplos encadeamento.
     */

        No <String> no1 = new No<>("Conteudo No1");

        No <String> no2 = new No<>("Conteudo No2");

        no1.setProximoNo(no2);

        No <String> no3 = new No<>("Conteudo No3");

        no2.setProximoNo(no3);

        No <String> no4 = new No<>("Conteudo No4");

        no3.setProximoNo(no4);

        System.out.println(no1); // referenciando o nó um.
        System.out.println(no1.getProximoNo()); // referenciando o nó 1 e o próximo nó, no2.
        System.out.println(no1.getProximoNo().getProximoNo()); // referanciando o no1, que pega no2 e referencia no3
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // mesma coisa
    }
}
