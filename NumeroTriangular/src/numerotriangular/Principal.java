package numerotriangular;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira aqui o número a ser conferido: ", "Teste Triangular", 3));

        Numero objNumero = new Numero(n);

        if (objNumero.Escalar() == 0) {
            JOptionPane.showMessageDialog(null, "O número não é Triangular.", "Teste Triangular", 0);
        } else {

            int digito = objNumero.Escalar();
            JOptionPane.showMessageDialog(null, "O número é Triangular! \ne é formado por: " + digito + " " + (digito + 1) + " " + (digito + 2) + "!", "Teste Triangular", 1);
        }
    }
}
