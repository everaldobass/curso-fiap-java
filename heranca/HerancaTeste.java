package br.fiap.com.heranca;

public class HerancaTeste {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAlimneta("Animal se alimenta");
        animal.setLocomove("Todo animal se locomove");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimneta("Come ração");
        cachorro.setLocomove("Tem patas");
        cachorro.setLatido("Cachorro latindo auau auau ");

        System.out.println("\n======== Dados de um Animal! ==============");

        System.out.println("Animal: " + animal.getAlimneta());
        System.out.println("Animal: " + animal.getLocomove());


        System.out.println("\n======== Dados de um cahocorro! ==============");

        System.out.println("Cachorro: " + cachorro.getAlimneta());
        System.out.println("Cachorro: " + cachorro.getLocomove());
        System.out.println("Cachorro: " + cachorro.getLatido());



    }


}
