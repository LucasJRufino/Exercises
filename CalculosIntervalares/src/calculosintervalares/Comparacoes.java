package calculosintervalares;

public class Comparacoes {

    private int valorMinimo;
    private int valorMaximo;

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }



    public int calculoImpares() {
        int resultado = valorMinimo;
        for (int i = valorMinimo; i <= valorMaximo; i++) {

            if (i % 2 > 0) {
                resultado = resultado * i;
            }
        }
        return resultado;
    }
}
