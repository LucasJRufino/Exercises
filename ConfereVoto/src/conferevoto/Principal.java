package conferevoto;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Insira o nome:", "Confere Voto", 3);
        String sexo = JOptionPane.showInputDialog(null, "Insira o sexo:", "Confere Voto", 3);
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade:", "Confere Voto", 3));

        Pessoa objPessoa = new Pessoa(nome, sexo, idade);

        JOptionPane.showMessageDialog(null, objPessoa.situacao(), "Situação", 1);
    }

}
