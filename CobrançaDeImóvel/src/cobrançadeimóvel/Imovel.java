package cobrançadeimóvel;

import java.text.DecimalFormat;

public class Imovel {

    private String identificacao;
    private double imposto;
    private int meses;

    DecimalFormat formatacao = new DecimalFormat("#.00");

    public Imovel(String identificacao, double imposto, int meses) {
        this.identificacao = identificacao;
        this.imposto = imposto;
        this.meses = meses;
    }

    public String multa() {
        double resultado = (double) (imposto * (Math.pow(1.02, meses)));

        if (resultado == 1) {
            resultado = 0;
        }
        resultado -= imposto;

        return formatacao.format(resultado);
    }

    public String cobranca() {
        return "Identificação do imóvel: " + identificacao
                + "\nValor  do imposto: R$" + formatacao.format(imposto)
                + "\nMeses em atraso: " + meses
                + "\nMulta à pagar: R$" + multa();
    }
}
