package estrutura;

public class exDoWhile {
    public static void main(String[] args) {
        int qtdProd = 5;
        int resgistro = 0;


        // Do While Executa sempre para depois verificar a condição
        do {
            resgistro++;
            System.out.printf("\n Produtos: " + resgistro);
        } while (resgistro < qtdProd);
    }
}
