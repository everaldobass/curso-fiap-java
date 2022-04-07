package fluxodecontrole;

public class ControleIf {
    public static void main(String[] args) {

        int idade = 20;

        if (idade >= 20 && idade < 70){
            System.out.println("Maior Idade: " + idade + " Anos");
        } else if(idade >= 70){
            System.out.println("Terceira Idade: " + idade + " Anos");
        } else{
            System.out.println("Menor Idade: " + idade + " Anos");
        }
    }
}
