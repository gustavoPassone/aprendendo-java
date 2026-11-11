package exer.classes_metodos.test;

import exer.classes_metodos.dominio.ContaBancaria;

public class ContaBancariaTest05 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Felipe Neto";
        conta.numeroConta = "33445-6";
        conta.saldo = 800.0;

        System.out.println("Saldo inicial: R$ " + conta.saldo);

        System.out.println("\nTentando sacar R$ 300.0 (válido):");
        conta.sacar(300.0);
        System.out.println("Saldo atual: R$ " + conta.saldo);

        System.out.println("\nTentando sacar R$ 1000.0 (inválido):");
        conta.sacar(1000.0);
        System.out.println("Saldo atual: R$ " + conta.saldo);
    }
}

