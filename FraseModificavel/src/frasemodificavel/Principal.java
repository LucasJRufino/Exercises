package frasemodificavel;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

 String frase = JOptionPane.showInputDialog(null, "Insira a frase que deseja modificar: ", "Modificador de frases", 3);
        String[] escolha = {"Substituir", "Caixa alta", "Quantidade de caracteres", "Quantidade de letras", "Quantidade de dígitos", "Sair"};
        String resposta;

        Frase objFrase = new Frase(frase);

        do {
            resposta = (String) JOptionPane.showInputDialog(null, "Escolha o que deseja fazer com: \n" + objFrase.getFrase(), "Modificador de frases", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

            switch (resposta) {
                case "Substituir":
                    String letra = JOptionPane.showInputDialog(null, "Qual letra deseja substituir da frase: " + objFrase.getFrase(), "Modificador de frases", 3);
                    if ((objFrase.getFrase().contains(letra))) {
                        objFrase.modifica(letra);
                    } else {
                        JOptionPane.showMessageDialog(null, "A frase não contém essa letra!", "Modificador de frases", 0);
                    }
                    break;
                case "Caixa alta":
                    objFrase.caixaAlta();
                    break;
                case "Quantidade de caracteres":
                    JOptionPane.showMessageDialog(null, "A frase contém: " + objFrase.quantidadeCaracteres() + " caracteres!", "Modificador de frases", 0);
                    break;
                case "Quantidade de letras":
                    JOptionPane.showMessageDialog(null, "A frase contém: " + objFrase.quantidadeLetras() + " letras!", "Modificador de frases", 0);
                    break;
                case "Quantidade de dígitos":
                    JOptionPane.showMessageDialog(null, "A frase contém: " + objFrase.quantidadeDigitos() + " dígitos!", "Modificador de frases", 0);
                    break;
            }
        } while (!resposta.equals("Sair"));
    }
    }
    
}
