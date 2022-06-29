package sistema.escolar;

public class Aluno {

    private static String nome;
    private static String ra;
    private static float nota1;
    private static float nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Aluno.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        Aluno.ra = ra;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        Aluno.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        Aluno.nota2 = nota2;
    }

    public float Media() {
        float dados = (nota1 + nota2) / 2;
        return dados;
    }

    public String Situacao() {
        if (Media() > 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String Boletim() {

        return "Nome: "
                + nome
                + "\nRA: " + ra
                + "\nNota 1ºBimestre: " + nota1
                + "\nNota 2ºBimestre: " + nota2
                + "\nMedia final: " + Media()
                + "\nSituação final: " + Situacao();
    }
}
 