package exer.classes_metodos.test;

import exer.classes_metodos.dominio.ContaBancaria;

public class ContaBancariaTest03 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Juliana Costa";
        conta.numeroConta = "54321-9";
        conta.saldo = 500.0;

        double saque1 = 300.0;
        double saque2 = 700.0;

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo disponível: R$ " + conta.saldo);
        System.out.println("Pode sacar R$ " + saque1 + "? " + conta.podeSacar(saque1));
        System.out.println("Pode sacar R$ " + saque2 + "? " + conta.podeSacar(saque2));
    }
}

