public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //java fortemente tipado
        short numerocurto = 1;
        int numeroCurto1 = numerocurto;
        short numeroCurto2 = (short) numeroCurto1; //realizando um casting (convertendo para uma variável menor)

        //variaveis não constantes
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        //variavel constante
        final double VALOR_DE_PI = 3.14;
    }
}
