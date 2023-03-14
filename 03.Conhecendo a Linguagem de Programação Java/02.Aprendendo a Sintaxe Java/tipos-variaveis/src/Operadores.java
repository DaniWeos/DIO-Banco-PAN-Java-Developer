public class Operadores {
    public static void main(String[] args) {

        //concatenação de palavras
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        
        System.out.println("Concatenando: " + nomeCompleto);

        //convertendo numeros
        int numero = 5;
        System.out.println("Numero inicial: " + numero);
        //negativo
        numero = - numero;

        System.out.println("Convertendo pra negativo: " + numero);
        //positivo
        numero = numero * -1;

        System.out.println("Convertendo pra positivo: " + numero);

        //incrementando um numero;
        numero ++;
        System.out.println("Incrementando: " + numero);

        //decrementando um numero
        numero --;
        System.out.println("Decrementando: " + numero);

        //invertendo valores boleanos
        boolean variavel = true;
        variavel = !variavel;
        System.out.println("Boleano: " + variavel);

        //operador ternário
        int a,b;
        a = 6;
        b = 5;

        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println("Operador Ternário: " + resultado);
        
        //relacionais

        int x = 10;
        int y = 11;

        //maior que
        if (y > x){
            System.out.println("É maior");
        }

        //maior igual
        y = 10;
        if (y >= x){
            System.out.println("É maior ou igual");
        }
        //igual
        if (y == x){
            System.out.println("É igual");
        }
        //menor ou igual
        if (y <= x){
            System.out.println("É menor ou igual");
        }
        //menor igual
        y = 8;
        if (y < x){
            System.out.println("É menor");
        }
        //diferente 
        y = 8;
        if (y != x){
            System.out.println("É diferente");
        }

        //logicos

        boolean condicao1 = true;
        boolean condicao2 = false;
        //operador E "&&"
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        } else {
            System.out.println("Algumas das condições não é verdadeira");
        }
        //operador OU "||"
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
