package br.fiap.com.banco.teste;

import br.fiap.com.banco.Conta;
import br.fiap.com.banco.ContaCorrente;

public class Teste {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(5555);
        cc.setNumero(5453);
        cc.setTipo("PF");
        cc.setChequeEspecial(1000);


        System.out.println(" Agência: " + cc.getAgencia());
        System.out.println(" Número: " + cc.getNumero());
        System.out.println(" Tipo: " + cc.getTipo());
        System.out.println(" Cheque Especial: " + cc.getSaldoDisponivel());

        // Conta corrente com polimorfismo
        System.out.println("\n=========Polimorfismo===========");
        Conta c1 = new ContaCorrente();
        c1.despositar(2000);
        c1.retirar(500);

        System.out.println(" Retirar Sobrescrita: " + c1.getSaldo());
    }
}
