package br.fiap.com.metodos;

import java.util.Locale;

public class LoweCase {

    public static void main(String[] args) {

        String descricao = new String("Maçã mais saborosa do Brasil!");

        System.out.println(descricao.toLowerCase());
        System.out.println(descricao.toUpperCase());

        System.out.println(descricao.substring(0, 4));
        System.out.println(descricao.substring(4));

    }
}
