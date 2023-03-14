
public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));//inserindo dados na pilha
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        minhaPilha.push(new No(7));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());//apagando o topo da pilha. o LIFO

        System.out.println(minhaPilha);

        minhaPilha.push(new No(99));

        System.out.println(minhaPilha);
    }
}
