package manipuladornumerico;

public class Numeros {

    private int n1, n2, n3;

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int maiorNumero() {
        int maior;
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }
        return maior;
    }

    public int menorNumero() {
        int menor;
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }
        return menor;

    }

    public String ordemCrescente() {
        int meio;

        if (n1 != maiorNumero() && n1 != menorNumero()) {
            meio = n1;
        } else if (n2 != maiorNumero() && n2 != menorNumero()) {
            meio = n2;
        } else {
            meio = n3;
        }
        return "Ordem crescente: " + menorNumero() + " < " + meio + " < " + maiorNumero();
    }

    public String somaPares() {

        String isPar = "Os números não são todos Pares";
        int soma;
        if (n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0) {

            soma = n1 + n2 + n3;
            isPar = "A soma de todos os números:" + soma;
        }
        return isPar;
    }

    public String produtoImpares() {

        String isImpar = "Pelo menos dois números são Pares";
        int produto;
        boolean confirma = false;
        if (n1 % 2 > 0 && n2 % 2 > 0) {
            confirma = true;

        } else if (n1 % 2 > 0 && n3 % 2 > 0) {
            confirma = true;

        } else if (n2 % 2 > 0 && n3 % 2 > 0) {

            confirma = true;
        }
        if (confirma) {

            produto = n1 * n2 * n3;
            isImpar = "O Produto de todos os números é: " + produto;
        }
        return isImpar;
    }
}
