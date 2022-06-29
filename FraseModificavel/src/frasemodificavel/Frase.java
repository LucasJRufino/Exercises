package frasemodificavel;

public class Frase {

    private String frase;

    public String getFrase() {
        return frase;
    }

    public Frase(String frase) {
        this.frase = frase;
    }

    public void modifica(String letra) {
        frase = frase.replace(letra, "X");
    }

    public void caixaAlta() {
        frase = frase.toUpperCase();
    }

    public int quantidadeLetras() {
        int quantidade = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (Character.isLetter((frase.charAt(i)))) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int quantidadeCaracteres() {
        int quantidade = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) != ' ') {
                quantidade++;
            }
        }
        return quantidade;

    }

    public int quantidadeDigitos() {
        return frase.length();
    }
}
