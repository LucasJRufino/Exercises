package manipuladornumerico;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número: ", "Manipulador de Números", 2));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo número: ", "Manipulador de Números", 2));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro número: ", "Manipulador de Números", 2));

        Numeros objNumeros = new Numeros();
        objNumeros.setN1(n1);
        objNumeros.setN2(n2);
        objNumeros.setN3(n3);

        JOptionPane.showMessageDialog(null, "O maior Número é: " + objNumeros.maiorNumero()
                + "\nO menor Número é: " + objNumeros.menorNumero()
                + "\nA Ordem crescente dos números: " + objNumeros.ordemCrescente()
                + "\n" + objNumeros.somaPares()
                + "\n" + objNumeros.produtoImpares());
    }

}
