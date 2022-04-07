package banco;

/*
* Classe que abstrai um conta bancaria
* @author Everaldo Nascimento
* @version 1.0
* */

public class Conta {
    /*Atributos da conta*/
    private int numero;
    private int agencia;
    private double saldo;

    // Método Construtor sem parametros padrão
    public Conta(){

    }
    // Construtor com parametros
    public Conta(int numero, int agencia, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }



    /*
    * Depositar um valor do saldo da conta
    * @param valor valor a ser depositado
    * */
    public void despositar(double valor){

        this.saldo += valor;
    }

    /*
    * Retirar um valor do saldo da conta
    * @param valor valor a ser retirado
    * */
    public void retirar(double valor){

        this.saldo -= valor;
    }
    /*
    * Verificar o saldo da conta
    * @return valor do saldo da conta
    **/
    public double getSaldo(){

        return this.saldo;
    }


}
