package sistema.escolar;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String escolha = "";
        while (!escolha.equals("S")) {

            escolha = JOptionPane.showInputDialog(null, "O que deseja fazer? \n C - Criar cadastro \n E - Editar cadastro\n V - Ver cadastro \n S - Sair");
            Aluno objaluno = new Aluno();

            switch (escolha) {

                case "C":
                    String nome = JOptionPane.showInputDialog(null, "Insira o nome do aluno:", "Sistema escolar", 3);
                    String ra = JOptionPane.showInputDialog(null, "Insira o RA do aluno:", "Sistema escolar", 3);
                    float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do 1ºBimestre:", "Sistema escolar", 3));
                    float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do 2ºBimestre:", "Sistema escolar", 3));

                    objaluno.setNome(nome);
                    objaluno.setRa(ra);
                    objaluno.setNota1(nota1);
                    objaluno.setNota2(nota2);
                    JOptionPane.showMessageDialog(null, objaluno.Boletim(), "Boletim", 3);

                    break;

                case "E":
                    String editar = JOptionPane.showInputDialog(null, "O que deseja editar? \n N - Nome \n R - RA \n N1 - Nota 1ºbimestre \n N2 - Nota 2ºbimestre");
                    switch (editar) {

                        case "N":
                            String nomee = JOptionPane.showInputDialog(null, "Insira o nome do aluno:", "Sistema escolar", 3);
                            objaluno.setNome(nomee);
                            break;

                        case "R":
                            String rae = JOptionPane.showInputDialog(null, "Insira o RA do aluno:", "Sistema escolar", 3);
                            objaluno.setRa(rae);
                            break;

                        case "N1":
                            float nota1e = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do 1ºBimestre:", "Sistema escolar", 3));
                            objaluno.setNota1(nota1e);
                            break;

                        case "N2":
                            float nota2e = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do 2ºBimestre:", "Sistema escolar", 3));
                            objaluno.setNota2(nota2e);

                            break;
                    }
                    break;

                case "V":

                    JOptionPane.showMessageDialog(null, objaluno.Boletim(), "Boletim", 3);
                    break;

                case "S":
                    break;

            }
        }

    }
}
