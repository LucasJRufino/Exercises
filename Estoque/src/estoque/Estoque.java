package estoque;

public class Estoque {

    private String descricao;
    private int qtdAtual, qtdMinima;

    public Estoque(String descricao, int qtdAtual, int qtdMinima) {
        this.descricao = descricao;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void repor(int qtd) {
        qtdAtual += qtd;
    }

    public boolean darBaixa(int qtd) {
        if (qtdAtual - qtd < 0) {
            return false;
        } else {
            qtdAtual -= qtd;
            return true;
        }

    }

    public String dados() {
        String reposicao = "";
        if (precisaRepor()) {
            reposicao = "\nEstoque baixo!";

        }
        return "Produto: " + descricao + "\nQuantidade Mínima: " + qtdMinima + "\nQuantidade atual: " + qtdAtual + reposicao;
    }

    public boolean precisaRepor() {
        if (qtdAtual < qtdMinima) {
            return true;
        }
        return false;

    }
}
