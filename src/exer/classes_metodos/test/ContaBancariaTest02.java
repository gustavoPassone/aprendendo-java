package exer.classes_metodos.test;

import exer.classes_metodos.dominio.ContaBancaria;

public class ContaBancariaTest02 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Fernanda Lima";
        conta.numeroConta = "98765-4";
        conta.saldo = 150.0;

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: R$ " + conta.saldo);
        System.out.println("Tem saldo positivo? " + conta.temSaldo());
    }
}

