package potência;

public class Potencia {

    private float base;
    private int expoente;

//    public Potencia(float base, int expoente) {
//        this.base = base;
//        this.expoente = expoente;
//    }

    
    public void setBase(float base) {
        this.base = base;
    }

    public void setExpoente(int expoente) {
        this.expoente = expoente;
    }

    public float getBase() {
        return base;
    }

    public int getExpoente() {
        return expoente;
    }

    public double calPotencia() {
        double resultado = 0;

        if (expoente == 0) {

            resultado = 1;
        } else if (expoente == 1) {

            resultado = base;
        } else {

            resultado = 1;
            for (int i = 1; i <= expoente; i++) {

                resultado = resultado * base;
            }

        }
        return resultado;
    }
}
