package equacaodosegundograu;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de 'A' aqui: ", "Calculadora de Segundo Grau", 3));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de 'B' aqui: ", "Calculadora de Segundo Grau", 3));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de 'C' aqui: ", "Calculadora de Segundo Grau", 3));

        Equacao2Grau objEquacao = new Equacao2Grau();
        objEquacao.setA(a);
        objEquacao.setB(b);
        objEquacao.setC(c);

        JOptionPane.showMessageDialog(null, objEquacao.raizes(), "Calculadora de Segundo Grau", 1);
    }

}
