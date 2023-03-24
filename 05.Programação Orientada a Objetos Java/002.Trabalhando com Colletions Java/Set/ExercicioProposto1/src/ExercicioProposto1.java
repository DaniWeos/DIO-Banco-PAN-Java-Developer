import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        /*
         * Crie uma conjunto contendo as cores do arco-íris e:
         * a) Exiba todas as cores o arco-íris uma abaixo da outra;
         * b) A quantidade de cores que o arco-íris tem;
         * c) Exiba as cores em ordem alfabética;
         * d) Exiba as cores na ordem inversa da que foi informada;
         * e) Exiba todas as cores que começam com a letra ”v”;
         * f) Remova todas as cores que não começam com a letra “v”;
         * g) Limpe o conjunto;
         * h) Confira se o conjunto está vazio;
         */
        System.out.println("--Cores Arco iris--");

        Set<String> arcoIris = new HashSet<>();

        arcoIris.add("vermelho");
        arcoIris.add("azul");
        arcoIris.add("anil");
        arcoIris.add("verde");
        arcoIris.add("amarelo");
        arcoIris.add("laranja");
        arcoIris.add("violeta");
        System.out.println("\n");

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : arcoIris) { //este foreach imprime um abaixo do outro
            System.out.println(cor);
        }
        System.out.println("\n");

        System.out.println("A quantidade de cores que o arco-íris tem: " + arcoIris.size());//size mostra o tamanho da minha lista
        System.out.println("\n");

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris); // TreeSet sempre organiza por ordem alfabetica
        System.out.println(arcoIris2);
        System.out.println("\n");

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> arcoIris3 = new LinkedHashSet<>(
        Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(arcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(arcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
        System.out.println("\n");   

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: arcoIris) {
            if(cor.startsWith("v")) System.out.println(cor); // startsWith é algo sobre, se começa com o ("argumento") , imprima.
        }
        System.out.println("\n");
        
        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = arcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(arcoIris);
        System.out.println("\n");

        System.out.println("Limpe o conjunto: ");
        arcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());
    }
}

class ArcoIris {
    private String cor;
    

    public ArcoIris(String cor) {
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "[cor=" + cor + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArcoIris other = (ArcoIris) obj;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        return true;
    }
}
