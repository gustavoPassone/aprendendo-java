package exer.classes_metodos.dominio;

public class Banco {
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.podeSacar(valor)) {
            origem.saldo -= valor;
            destino.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

