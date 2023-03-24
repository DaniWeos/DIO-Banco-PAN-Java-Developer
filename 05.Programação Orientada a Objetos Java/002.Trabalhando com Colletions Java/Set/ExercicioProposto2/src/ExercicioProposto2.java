/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) ide;
d) Ano de criação e nome;
e) Nome, ano de criação e ide;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {

        System.out.println("Linguagens Favoritas");
        Set<LinguagemFavorita> linguagens = new HashSet<>() {
            {

                add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
                add(new LinguagemFavorita("C#", 1999, "VSCode"));
                add(new LinguagemFavorita("Python", 1991, "PyCharm"));

            }
        };
        for (LinguagemFavorita linguagem : linguagens)
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - " + linguagem.getide());
        System.out.println("\n");

        System.out.println("Ordem de inserção");
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>() {
            {

                add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
                add(new LinguagemFavorita("C#", 1999, "VSCode"));
                add(new LinguagemFavorita("Python", 1991, "PyCharm"));

            }
        };
        for (LinguagemFavorita linguagem : linguagens1)
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - " + linguagem.getide());
        System.out.println("\n");

        System.out.println("Ordem Natural(nome)");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens1);
        for (LinguagemFavorita linguagem : linguagens2)
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoDeCriacao() + " - " + linguagem.getide());
        System.out.println("\n");

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(linguagens);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(linguagens);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(linguagens);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);
        
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getide() {
        return ide;
    }

    public void setide(String ide) {
        ide = ide;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + anoDeCriacao;
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
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
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao != other.anoDeCriacao)
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareTo(linguagemFavorita.getNome());
    }

    class ComparatorIde implements Comparator<LinguagemFavorita>{

        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            return lf1.ide.compareToIgnoreCase(lf2.ide);
        }
    }
    
    class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{
    
        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
            if (anoDeCriacao != 0) return anoDeCriacao;
            return lf1.nome.compareToIgnoreCase(lf2.nome);
        }
    }
    
    class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{
    
        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
            int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
            if (nome != 0) return nome;
            if (anoDeCriacao != 0) return anoDeCriacao;
            return lf1.ide.compareToIgnoreCase(lf2.ide);
        }
    }
}