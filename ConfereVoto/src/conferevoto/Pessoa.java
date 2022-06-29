package conferevoto;

public class Pessoa {

    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String verificar() {
        String estado = "Não está apto";
        if (idade >= 18 && idade < 70) {
            estado = "Voto obrigatório";
        } else if (idade >= 70 || idade == 16 || idade == 17) {
            estado = "Voto facultativo";
        }
        return estado;
    }

    public String situacao() {
        return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade
                + "\nSituação do voto: \n" + verificar();
    }
}
