package br.fiap.com.metodos;

public class ExmetodoLength {

    public static void main(String[] args) {
        String descricao = new String("Maçã mais saborosa do Brasil!");
        // Contar a quantidade de Caracter
        System.out.println(descricao.length());

        System.out.println(descricao.startsWith("Maça"));
        System.out.println(descricao.endsWith("!"));

        // Localizar
        System.out.println(descricao.charAt(1));

        System.out.println(descricao.indexOf("s"));
        System.out.println(descricao.indexOf("Brasil"));

        System.out.println(descricao.indexOf("a"));
        System.out.println(descricao.lastIndexOf("a"));


    }
}
