package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _47CardapioDaLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CARDÁPIO ===");
        System.out.println("1: Hambúrguer - R$ 25,00");
        System.out.println("2: Pizza - R$ 40,00");
        System.out.println("3: Salada - R$ 18,00");
        System.out.println("4: Refrigerante - R$ 8,00");

        System.out.print("Escolha a opção (1 a 4): ");
        int opcao = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        String item = "";
        double precoUnitario = 0.0;
        boolean opcaoValida = true;

        switch (opcao) {
            case 1:
                item = "Hambúrguer";
                precoUnitario = 25.00;
                break;
            case 2:
                item = "Pizza";
                precoUnitario = 40.00;
                break;
            case 3:
                item = "Salada";
                precoUnitario = 18.00;
                break;
            case 4:
                item = "Refrigerante";
                precoUnitario = 8.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Opção inválida.");
                break;
        }

        if (opcaoValida) {
            double valorTotal = precoUnitario * quantidade;
            System.out.printf("Item: %s | Quantidade: %d | Total do pedido: R$ %.2f%n", item, quantidade, valorTotal);
        }

        sc.close();
    }
}
