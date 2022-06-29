package automóvel;

import java.util.Date;

public class Automovel {

    private String marca, modelo, cor, combustivel;
    private float precocusto, precovenda;
    private int ano;
    private double porcentagem;

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;

    }

    public Automovel(String marca, String modelo, int ano, String cor, String combustivel, float precocusto, float precovenda) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;
        this.precocusto = precocusto;
        definePrecoVenda();
    }

    public Automovel() {
    }

    public Automovel(String marca, String modelo, String cor, String combustivel, float precocusto, float precovenda) {

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.precocusto = precocusto;
        Date D = new Date();
        int anoatual = D.getYear() + 1900;
        this.ano = anoatual;
        definePrecoVenda();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public float getPrecocusto() {
        return precocusto;
    }

    public int getAno() {
        return ano;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    private void definePrecoVenda() {
        switch (getCombustivel()) {
            case "gasolina":

                precovenda = precocusto + precocusto * 5 / 100;

            case "alcool":
                precovenda = precocusto + precocusto * 7 / 100;

            case "diesel":
                precovenda = precocusto + precocusto * 15 / 100;

            case "gnv":
                precovenda = precocusto + precocusto * 3 / 100;

            case "flex":
                precovenda = precocusto + precocusto * 10 / 100;

        }

    }

    public void definePrecoVenda(double porcentagem) {
        precovenda += precovenda * porcentagem / 100;
    }

    public String relatorioAutomovel() {
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nAno: " + ano
                + "\nCor: " + cor
                + "\nCombustível: " + combustivel
                + "\nPreço inicial: R$ " + precocusto
                + "\nPreço final: R$ " + precovenda;
    }
}
