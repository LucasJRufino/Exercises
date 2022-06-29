package decimalbinário;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número Decimal a ser convertido para Binário: ", "Conversor Binário", 3));

        Binario objBinario = new Binario(decimal);

        JOptionPane.showMessageDialog(null, "O número " + decimal + " em Binário fica: \n" + objBinario.getBinario(), "Conversor Binário", 1);
    }

}
