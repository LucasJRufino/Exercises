package fibonacci;

public class Fibonacci {

    public String Fibonacci() {
        int atual = 1;
        int n2 = 1;
        int n3 = 0;

        String saida = "0 1 1";

        for (int i = 4; i <= 20; i++) {
            n3 = n2;
            n2 = atual;
            atual = n3 + n2;
            saida += " " + atual;
        }
        return saida;
    }
}
