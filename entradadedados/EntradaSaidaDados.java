package entradadedados;

import java.util.Scanner;

public class EntradaSaidaDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite um nome: ");
        nome = sc.nextLine();

        System.out.println("Digite idade: ");
        idade = sc.nextInt();

        System.out.println("======= Dados Cadastrados ======");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        sc.close();

    }
}
