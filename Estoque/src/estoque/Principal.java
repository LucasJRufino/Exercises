package estoque;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Insira o nome do produto aqui: ", "SuperEstoque", 3);
        int qtdMinima = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade mínima do produto aqui: ", "SuperEstoque", 3));
        int qtdAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade atual do produto aqui: ", "SuperEstoque", 3));
        String resposta = "";

        Estoque objEstoque = new Estoque(nome, qtdAtual, qtdMinima);

        String[] opcoes = {"Retirar do estoque", "Repor Estoque", "Consultar Estoque", "Sair"};

        do {
            resposta = (String) (JOptionPane.showInputDialog(null, "Oque deseja fazer?", "SuperEstoque", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]));
            switch (resposta) {
                case "Retirar do estoque":
                    int qtdRetirar = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira quantos itens você removerá: (" + objEstoque.getQtdAtual() + ")", "SuperEstoque", 3));
                    if (objEstoque.darBaixa(qtdRetirar)) {
                        JOptionPane.showMessageDialog(null, "Itens removidos com sucesso!", "SuperEstoque", 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "Quantidade de itens a remover\nultrapassou quantidade disponível!", "SuperEstoque", 3);
                    }
                    break;
                case "Repor Estoque":
                    int qtdRepor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira quantos itens você recolocará: (quantidade atual: " + objEstoque.getQtdAtual() + ")", "SuperEstoque", 3));
                    objEstoque.repor(qtdRepor);
                    JOptionPane.showMessageDialog(null, "Itens repostos com sucesso!", "SuperEstoque", 3);
                    break;
                case "Consultar Estoque":
                    JOptionPane.showMessageDialog(null, objEstoque.dados(), "SuperEstoque", 3);
                    break;
            }
        } while (!resposta.equals("Sair"));

    }

}
