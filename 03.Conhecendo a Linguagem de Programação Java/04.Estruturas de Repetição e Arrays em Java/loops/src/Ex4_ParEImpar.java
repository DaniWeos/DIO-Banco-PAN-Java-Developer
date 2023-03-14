import java.util.Scanner;

/*
Faça um programa que peça N numeros interos, 
mostre a quantidade de pares e impares
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numeros = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int count = 0;

        do{
        
        System.out.println("Digite um número: ");
        numeros = scan.nextInt();

        if (numeros % 2 == 0) par ++;
        else impar ++;

        count++;

        } while (count < qtdNumeros);

        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de impares: " + impar);
    }
    
}
