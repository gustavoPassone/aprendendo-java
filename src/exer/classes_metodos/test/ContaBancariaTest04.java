package exer.classes_metodos.test;

import exer.classes_metodos.dominio.ContaBancaria;

public class ContaBancariaTest04 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Larissa Manoela";
        conta.numeroConta = "11223-4";
        conta.saldo = 1000.0;

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo antes: R$ " + conta.saldo);

        double deposito = 500.0;
        conta.depositar(deposito);
        System.out.println("Valor depositado: R$ " + deposito);

        System.out.println("Saldo depois: R$ " + conta.saldo);
    }
}

