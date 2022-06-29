package appcontacorrentesimples;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String[] operacao = {"Abrir uma conta", "Atualizar cadastro", "Dados da conta", "Movimentação Bancária", "Sair"};
        String[] monetaria = {"Sacar", "Depositar", "Retornar"};
        String[] atualizarCadastro = {"Número da conta", "Nome", "Sobrenome", "CPF"};

        String numeroConta;
        String nome;
        String sobrenome;
        String cpf;

        String decisao = "";
        String atualizacao = "";
        String movimentacao = "";

        ContaCorrente objConta = null;
        Pessoa objPessoa = null;
        ContaCorrente objmonetario = null;

        while (!decisao.equals("Sair")) {
            decisao = (String) JOptionPane.showInputDialog(null, "Qual operação deseja realizar?", "Banco Furta-mil", JOptionPane.PLAIN_MESSAGE, null, operacao, operacao[0]);

            switch (decisao) {

                case "Abrir uma conta":
                    numeroConta = JOptionPane.showInputDialog(null, "Insira o número da conta: ", "Banco Furta-mil", 3);
                    nome = JOptionPane.showInputDialog(null, "Insira o primeiro nome: ", "Banco Furta-mil", 3);
                    sobrenome = JOptionPane.showInputDialog(null, "Insira o sobrenome: ", "Banco Furta-mil", 3);
                    int opcaoCadastro = JOptionPane.showConfirmDialog(null, "Deseja realizar o cadastro com o CPF?", "Banco Furta-mil", JOptionPane.YES_NO_OPTION, 3);

                    if (opcaoCadastro == 0) {

                        cpf = JOptionPane.showInputDialog(null, "Insira o cpf: ", "Banco Furta-mil", 3);

                        objPessoa = new Pessoa(nome, sobrenome, cpf);

                    } else {

                        objPessoa = new Pessoa(nome, sobrenome);

                    }
                    objConta = new ContaCorrente(numeroConta, objPessoa);
                    break;

                case "Atualizar cadastro":

                    if (objConta != null) {
                        atualizacao = (String) JOptionPane.showInputDialog(null, "Qual operação deseja realizar?", "Banco Furta-mil", JOptionPane.PLAIN_MESSAGE, null, atualizarCadastro, atualizarCadastro[0]);

                    } else {
                        atualizacao = "erro";
                    }
                    switch (atualizacao) {
                        case "Número da conta":

                            objConta.setNumeroConta(JOptionPane.showInputDialog(null, "Insira o número para alterar: ", "Banco Furta-mil", 3));
                            JOptionPane.showMessageDialog(null, "Número alterado com sucesso!", "Banco Furta-mil", 1);
                            break;

                        case "Nome":

                            objPessoa.setNome(JOptionPane.showInputDialog(null, "Insira o nome para alterar: ", "Banco Furta-mil", 3));
                            JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!", "Banco Furta-mil", 1);
                            break;

                        case "Sobrenome":

                            objPessoa.setSobrenome(JOptionPane.showInputDialog(null, "Insira o sobrenome para alterar: ", "Banco Furta-mil", 3));
                            JOptionPane.showMessageDialog(null, "Sobrenome alterado com sucesso!", "Banco Furta-mil", 1);
                            break;

                        case "CPF":
                            objPessoa.setCpf(JOptionPane.showInputDialog(null, "Insira o CPF para alterar: ", "Banco Furta-mil", 3));
                            JOptionPane.showMessageDialog(null, "CPF alterado com sucesso!", "Banco Furta-mil", 1);
                            break;

                        case "Erro":
                            JOptionPane.showMessageDialog(null, "Conta não cadastrada!", "Banco Furta-mil", 1);
                            break;
                    }

                case "Dados da conta":

                    if (objConta != null) {
                        JOptionPane.showMessageDialog(null, objConta.dadosDaConta(), "Banco Furta-mil", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta não cadastrada!", "Banco Furta-mil", 1);
                    }
                    break;

                case "Movimentação Bancária":
                    if (objConta != null) {
                        movimentacao = (String) JOptionPane.showInputDialog(null, "Qual operação deseja realizar?", "Banco Furta-mil", JOptionPane.PLAIN_MESSAGE, null, monetaria, monetaria[0]);
                    } else {
                        movimentacao = "Erro";
                    }
                    switch (movimentacao) {

                        case "Sacar":
                            float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor a ser sacado?", "Banco Furta-mil", 3));
                            objmonetario = new ContaCorrente();
                            if (objmonetario.saque(valor)) {

                            } else {
                                JOptionPane.showMessageDialog(null, "Saldo indisponível.", "Banco Furta-mil", 1);
                            }
                            break;
                        case "Erro":
                            JOptionPane.showMessageDialog(null, "Conta não cadastrada!", "Banco Furta-mil", 1);
                            break;
                    }
            }

        }
    }
}
