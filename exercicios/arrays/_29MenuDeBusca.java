package exercicios.arrays;

import java.util.Scanner;

public class _29MenuDeBusca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[5];

        System.out.println("=== Cadastro de 5 Produtos ===");
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }

        System.out.println("\n=== Menu de Opções ===");
        System.out.println("1. Listar todos os produtos");
        System.out.println("2. Buscar produto pelo nome");
        System.out.println("3. Mostrar quantidade de produtos cadastrados");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("\n=== Lista de Produtos Cadastrados ===");
                for (int i = 0; i < produtos.length; i++) {
                    System.out.println((i + 1) + ". " + produtos[i]);
                }
                break;

            case 2:
                System.out.print("\nDigite o nome do produto para buscar: ");
                String busca = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < produtos.length; i++) {
                    if (produtos[i].equalsIgnoreCase(busca)) {
                        System.out.println("Produto encontrado na posição (indice): " + i);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Produto \"" + busca + "\" não foi encontrado.");
                }
                break;

            case 3:
                System.out.println("\nQuantidade de produtos cadastrados: " + produtos.length);
                break;

            default:
                System.out.println("\nOpção invalida!");
                break;
        }

        scanner.close();
    }
}
