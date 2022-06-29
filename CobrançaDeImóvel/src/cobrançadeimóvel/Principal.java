package cobrançadeimóvel;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String identificacao = JOptionPane.showInputDialog(null, "Insira a identificação do ímóvel: ", "Registrador de Imóveis", 3);
        double imposto = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o imposto do Imóvel: ", "Registrador de Imóveis", 3));
        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira os meses em atraso: ", "Registrador de Imóveis", 3));

        Imovel objImovel = new Imovel(identificacao, imposto, meses);

        JOptionPane.showMessageDialog(null, objImovel.cobranca(), "Registrador de Imóveis", 1);
    }

}
