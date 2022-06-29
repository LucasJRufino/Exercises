package appcontacorrentesimples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaCorrente {

    private String numeroConta;
    private Pessoa titular;
    private float saldo;

    public ContaCorrente() {
    };

    public ContaCorrente(String numeroConta, Pessoa titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public float deposito(float valor) {
        saldo += valor;
        return saldo;
    }

    public boolean saque(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String dadosDaConta() {

        DateTimeFormatter mascaraData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataHoje = LocalDate.now();

        String dadosTitular = titular.nomeCompleto();

        if (titular.getCpf() != null) {

            dadosTitular += " CPF nº " + titular.getCpf();

        }
        return "Banco Furta-mil \n"
                + mascaraData.format(dataHoje) + "  Conta nº " + numeroConta
                + "\n Titular: " + dadosTitular + "\nSaldo: " + saldo;

    }
}
