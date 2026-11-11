package exer.classes_metodos.dominio;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public boolean temSaldo() {
        return saldo > 0;
    }

    public boolean podeSacar(double valorSaque) {
        return valorSaque <= saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (podeSacar(valor)) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
