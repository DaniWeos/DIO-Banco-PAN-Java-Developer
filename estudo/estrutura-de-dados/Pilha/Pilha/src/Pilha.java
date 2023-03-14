public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha; // guardo o que esta no topo em refAuxiliar
        refNoEntradaPilha = novoNo; // a nova referência vai ser meu topo
        refNoEntradaPilha.setRefNo(refAuxiliar); //

    }

    public No pop() {
        if (!this.isEmpty()) { // verifico se minha pilha não esta vazia
            No noPoped = refNoEntradaPilha; // guardo o nó que eu quero apagar
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // pego como referencia o nó logo abaixo do que vou
            return noPoped;
        }
        return null; // se estiver vazia retorno nulo
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false; // USANDO TERNÁRIO
    }

    @Override
    public String toString() {
        String stringRetorno = "----------\n";
        stringRetorno += "Pilha\n";
        stringRetorno = "----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado =" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {

                break;
            }
        }
        stringRetorno += "=========\n";
        return stringRetorno;
    }
}
