package calculadoradomitor;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o primeiro número:"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o segundo número:"));
        String operador = JOptionPane.showInputDialog(null, "Insira o operador da conta:");
        Contas objconta = new Contas();
        switch (operador) {
            case "+":
                JOptionPane.showMessageDialog(null, "O resultado foi: " + objconta.Somar(num1, num2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "O resultado foi: " + objconta.Subtrair(num1, num2));
                break;

            case "*":
                JOptionPane.showMessageDialog(null, "O resultado foi: " + objconta.Multiplicar(num1, num2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, "O resultado foi: " + objconta.Dividir(num1, num2));
                break;

        }

    }
}
