package calculosintervalares;

import javax.swing.JOptionPane;

public class Principal {
    

    public static void main(String[] args) {
        
        int valorMinimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor Mínimo aqui: ", "Multiplicação de ímpares", 3));
        int valorMaximo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor Máximo aqui: ", "Multiplicação de ímpares", 3));

        Comparacoes objComparacoes = new Comparacoes();
        objComparacoes.setValorMinimo(valorMinimo);
        objComparacoes.setValorMaximo(valorMaximo);

        JOptionPane.showMessageDialog(null, objComparacoes.calculoImpares(), "Multiplicação de Ímpares", 3);
    }

}
