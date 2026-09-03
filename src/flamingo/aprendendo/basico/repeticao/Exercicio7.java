package flamingo.aprendendo.basico.repeticao;

public class Exercicio7 {
    static void main(String[] args) {
        int quantidadeVendas = 8;
        double valorVenda = 50.0;
        double faturamentoTotal = 0.0;

        for (int i = 1; i <= quantidadeVendas; i++) {
            faturamentoTotal += valorVenda;
        }

        System.out.println("Quantidade de vendas: " + quantidadeVendas);
        System.out.println("Faturamento total: R$ " + faturamentoTotal);
    }
}
