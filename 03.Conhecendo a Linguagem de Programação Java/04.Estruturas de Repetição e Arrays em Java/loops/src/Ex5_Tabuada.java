import java.util.Scanner;

/*
Desenvolver um gerador de tabuada.
Ex: 5X1 = 5
    5X2 = 10
    5X3 = 15
    5X4 = 20
    5X5 = 25
    5X6 = 30
*/

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;

        System.out.println("Digite o número da tabuada desejada: ");
        tabuada = scan.nextInt();
    
        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada + "X" + i + "=" + (tabuada * i));
        }
}
}
