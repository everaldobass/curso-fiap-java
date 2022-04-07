package fundamentos;

import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Iforme um Número: ");
        int num1 = teclado.nextInt();

        System.out.println("Iforme outro Número: ");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("\n************* Calculadora *******");

        System.out.println("\n Soma: " + soma);
        System.out.println("\n Subtração: " + sub);
        System.out.println("\n Multiplicação: " + mult);
        System.out.println("\n Divisão: " + div);
        System.out.println("\n Modulo: " + modulo);

    }
}
