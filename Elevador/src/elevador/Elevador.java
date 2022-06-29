

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public boolean entra(int pessoasEntrar) {
        boolean resultado;
        if (pessoasEntrar + pessoas > capacidade) {
            resultado = false;
        } else {
            pessoas += pessoasEntrar;
            resultado = true;
        }
        return resultado;
    }

    public boolean sai(int pessoasSair) {
        boolean resultado;
        if (pessoas - pessoasSair < 0) {
            resultado = false;
        } else {
            pessoas -= pessoasSair;
            resultado = true;
        }
        return resultado;

    }

    public boolean sobe(int andaresSubir) {
        boolean resultado;
        if (andaresSubir + andarAtual > totalAndares) {
            resultado = false;
        } else {

            andarAtual += andaresSubir;
            resultado = true;
        }
        return resultado;
    }

    public boolean desce(int andaresDescer) {
        boolean resultado;
        if (totalAndares - andaresDescer < 0) {
            resultado = false;
        } else {
            andarAtual -= andaresDescer;
            resultado = true;
        }
        return resultado;
    }

    public String informacoes() {

        return "Pessoas dentro do elevador: " + pessoas
                + "\nCapacidade total: " + capacidade
                + "\nAndar atual: " + andarAtual
                + "\nTotal de andares: " + totalAndares;
    }
}
