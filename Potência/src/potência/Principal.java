package potência;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor da Base: ", "Calculador de Potência", 3));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da Base: ", "Calculador de Potência", 3));

        Potencia objPotencia = new Potencia();
        objPotencia.setBase(base);
        objPotencia.setExpoente(expoente);
        
        JOptionPane.showMessageDialog(null, "O resultado da potência foi: " + objPotencia.calPotencia(), "Calculador de Potência", 1);
    }

}
