

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int totalAndares = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos andares tem o prédio?", "Sistema do Prédio", 3));
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a capacidade do elevador?", "Sistema do Prédio", 3));
        int resposta = 0;

        Elevador objElevador = new Elevador(totalAndares, capacidade);

        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Entrar \n2 - Sair \n3 - Subir \n4 - Descer \n5 - Informações \n6 - Encerrar", "Sistema do Prédio", 3));

            switch (resposta) {

                case 1:

                    int pessoasEntrar = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas estão entrando no elevador?", "Sistema do Prédio", 3));
                    if (objElevador.entra(pessoasEntrar)) {
                        JOptionPane.showMessageDialog(null, pessoasEntrar + " pessoas entraram no elevador!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O número de pessoas entrando excede a capacidade do elevador!");
                    }
                    break;

                case 2:
                    int pessoasSair = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas estão saindo do elevador?", "Sistema do Prédio", 3));
                    if (objElevador.sai(pessoasSair)) {
                        JOptionPane.showMessageDialog(null, pessoasSair + " pessoas saíram do elevador!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O número de pessoas dentro do elevador é menor que " + pessoasSair + "!");
                    }
                    break;

                case 3:
                    int andaresSubir = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos andares o elevador vai subir?", "Sistema do Prédio", 3));
                    if (objElevador.sobe(andaresSubir)) {
                        JOptionPane.showMessageDialog(null, "O elevador subiu " + andaresSubir + " andares!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O número de andares a subir excede \na quantidade de andares no prédio!");
                    }

                    break;

                case 4:
                    int andaresDescer = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas estão saindo do elevador?", "Sistema do Prédio", 3));
                    if (objElevador.desce(andaresDescer)) {
                        JOptionPane.showMessageDialog(null, "O elevador desceu " + andaresDescer + " andares!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O número de andares a descer excede \nultrapassa o térreo!");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, objElevador.informacoes(), "Sistema do Prédio", 3);
                    break;
            }
        } while (resposta != 6);

    }

}
