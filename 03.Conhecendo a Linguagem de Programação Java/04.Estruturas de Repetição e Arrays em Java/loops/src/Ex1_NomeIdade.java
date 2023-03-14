import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){

        System.out.println("Digite seu nome: ");
        nome = scan.next();
        if (nome.equals("0")) break; //Compara o nome com o parâmetro do equals, ou seja, se for 0. Se for o break para.

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();
        }

        System.out.println("Verificando se saiu do laço");
    }


}