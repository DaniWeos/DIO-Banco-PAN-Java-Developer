public class Main {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente(); //upcast
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor_ = (Vendedor) new Funcionario(); //downcast

    }
}
