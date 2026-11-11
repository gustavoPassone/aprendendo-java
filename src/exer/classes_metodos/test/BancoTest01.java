package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Banco;
import exer.classes_metodos.dominio.ContaBancaria;

public class BancoTest01 {
    public static void main(String[] args) {
        ContaBancaria contaOrigem = new ContaBancaria();
        contaOrigem.titular = "Alice Souza";
        contaOrigem.numeroConta = "1001-1";
        contaOrigem.saldo = 1000.0;

        ContaBancaria contaDestino = new ContaBancaria();
        contaDestino.titular = "Bruno Lima";
        contaDestino.numeroConta = "2002-2";
        contaDestino.saldo = 300.0;

        System.out.println("--- Antes da Transferência ---");
        System.out.println("Saldo Alice: R$ " + contaOrigem.saldo);
        System.out.println("Saldo Bruno: R$ " + contaDestino.saldo);

        Banco banco = new Banco();
        double valorTransferencia = 400.0;
        System.out.println("\nTransferindo R$ " + valorTransferencia + " de Alice para Bruno...");
        banco.transferir(contaOrigem, contaDestino, valorTransferencia);

        System.out.println("\n--- Depois da Transferência ---");
        System.out.println("Saldo Alice: R$ " + contaOrigem.saldo);
        System.out.println("Saldo Bruno: R$ " + contaDestino.saldo);
    }
}

