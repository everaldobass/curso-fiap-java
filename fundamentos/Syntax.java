package fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);


        System.out.println("Diigite a primerira nota: ");
        int nun1 = entrada.nextInt();

        System.out.println("Digite a segunda nota: ");
        int num2 = entrada.nextInt();

        System.out.println("Digite a terceira nota: ");
        int num3 = entrada.nextInt();

        System.out.println("Digite a quarta nota: ");
        int num4 = entrada.nextInt();

        int resultado = nun1 + num2 + num3 + num4;
        int media = resultado / 4 ;

        System.out.println("Resultado:" + resultado);
        System.out.println("Média " + media);

        if(media > 7){
            System.out.println("Aprovado: " + media);
        } else if (media < 5){
            System.out.println("Reprovado: " + media  );
        }else{
            System.out.println("Recuperação: ");
        }

    }
}
