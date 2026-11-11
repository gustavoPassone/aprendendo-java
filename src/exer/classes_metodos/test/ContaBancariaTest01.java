package exer.classes_metodos.test;

import exer.classes_metodos.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Carlos Silva";
        conta.numeroConta = "12345-6";
        conta.saldo = 3500.75;

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da Conta: " + conta.numeroConta);
        System.out.println("Saldo: R$ " + conta.saldo);
    }
}

