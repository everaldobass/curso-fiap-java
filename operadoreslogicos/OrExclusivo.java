package operadoreslogicos;

public class OrExclusivo {
    public static void main(String[] args) {

        int x = 9, y = 11;

        boolean teste = x > 10 ^ y > 10;
        System.out.println(teste);
    }
}
