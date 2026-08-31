package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _40TipoDeCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total gasto no mês: R$ ");
        double totalGasto = sc.nextDouble();

        if (totalGasto <= 100.0) {
            System.out.println("Cliente comum");
        } else if (totalGasto <= 500.0) {
            System.out.println("Cliente bronze");
        } else if (totalGasto <= 1000.0) {
            System.out.println("Cliente prata");
        } else {
            System.out.println("Cliente ouro");
        }

        sc.close();
    }
}
