package br.fiap.com.banco.teste;

import br.fiap.com.banco.Conta;

public class TesteConta {
    public static void main(String[] args) {
        // Conta correte
        Conta cc = new Conta();

        cc.setNumero(55);
        cc.setAgencia(123);
        cc.despositar(50.0);

        cc.despositar(1000);
        System.out.println("\n Saldo atual Depositado R$ " + cc.getSaldo());

        // Conta poupança
        Conta cp = new Conta(111, 222, 1000);
        cp.retirar(50);
        System.out.println("\n Saldo Retirado R$ " + cp.getSaldo());

    }
}
