import java.util.Scanner;

/*
Fazer um calculo fatorial do número digitado pelo usuario.
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int total = 1;

        System.out.println("Digite o número do fatorial: ");
        fatorial = scan.nextInt();
    
        for(int i = fatorial; i >= 1; i--){
            total *= i;
        }

        System.out.println("Total da !" + fatorial + " é: " + total);
}
}

