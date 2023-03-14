import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Daniel");
        aluno.put("Idade", "23");
        aluno.put("Media", "9.8");
        aluno.put("Turma", "3A");

        System.out.println("\n");
        System.out.println(aluno);
        System.out.println("\n");

        System.out.println(aluno.keySet()); //todas as chaves
        System.out.println("\n");
        
        System.out.println(aluno.values()); //todos os valores
        System.out.println("\n");

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.8");
        aluno2.put("Turma", "3B");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
        System.out.println("\n");

        System.out.println(aluno.containsKey("Nome")); //verificar se contem "nome"
        
    }
}
