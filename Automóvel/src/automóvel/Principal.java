package automóvel;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        float precovenda = 0;

        String escolha;

        Automovel objauto = null;

        do {

            String[] opcoes = {"Cadastrar dados do automóvel", "Visualizar cadastro", "Reajustar valor do automóvel", "Sair"};

            Object escolhaobj = JOptionPane.showInputDialog(null, "Escolha", "CadastroAuto 1.0", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            escolha = escolhaobj.toString();

            switch (escolha) {

                case "Cadastrar dados do automóvel":

                    String marca = JOptionPane.showInputDialog(null, "Insira a marca do automóvel", "CadastroAuto 1.0", 3);

                    String modelo = JOptionPane.showInputDialog(null, "Insira o modelo do automóvel", "CadastroAuto 1.0", 3);

                    String cor = JOptionPane.showInputDialog(null, "Insira a cor do automóvel", "CadastroAuto 1.0", 3);

                    String combustivel = JOptionPane.showInputDialog(null, "Insira o combustível do automóvel", "CadastroAuto 1.0", 3);

                    Float precocusto = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço do automóvel", "CadastroAuto 1.0", 3));

                    int anoescolha = JOptionPane.showConfirmDialog(null, "O carro é do ano atual?", "Cadastro Auto 1.0", JOptionPane.YES_NO_CANCEL_OPTION);

                    if (anoescolha != 0) {
                        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano do automóvel", "CadastroAuto 1.0", 3));
                        objauto = new Automovel(marca, modelo, ano, cor, combustivel, precocusto, precovenda);

                    } else {
                        objauto = new Automovel(marca, modelo, cor, combustivel, precocusto, precovenda);

                    }
                    break;

                case "Visualizar cadastro":

                    JOptionPane.showMessageDialog(null, objauto.relatorioAutomovel());

                    break;

                case "Reajustar valor do automóvel":
                    double porcentagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a porcentagem adicional ao valor", "CadastroAuto 1.0", 3));
                    objauto.definePrecoVenda(porcentagem);
                  
                    break;

            }

        } while (!escolha.equals("Sair"));
    }
}
