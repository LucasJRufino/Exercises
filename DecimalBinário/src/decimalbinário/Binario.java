package decimalbinário;

public class Binario {

    private String binario;

    public String getBinario() {
        return binario;
    }

    public Binario(int decimal) {
        binario = Integer.toBinaryString(decimal);
    }

}
