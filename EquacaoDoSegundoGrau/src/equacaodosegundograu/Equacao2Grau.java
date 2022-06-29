package equacaodosegundograu;

public class Equacao2Grau {

    private int a, b, c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public float calculaDelta() {

        return (b * b) - (4 * a * c);
    }

    public String raizes() {
        if (calculaDelta() > 0) {

            float raizDelta = (float) (Math.sqrt(calculaDelta()));
            float x1 = (float) (((-1 * b) + raizDelta) / (2 * a));
            float x2 = (float) (((-1 * b) - raizDelta) / (2 * a));

            return "O X1 é: " + x1 + "\nO X2 é: " + x2 + "\nO Delta foi: " + calculaDelta();

        } else {

            return "A resolução é impossível pois o delta: " + calculaDelta() + " é negativo.";

        }
    }
}
