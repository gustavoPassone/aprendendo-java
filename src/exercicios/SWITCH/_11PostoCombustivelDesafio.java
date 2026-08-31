package exercicios.SWITCH;

public class _11PostoCombustivelDesafio {
    public static void main(String[] args) {
        int tipoCombustivel = 1;
        double litros = 20.0;
        boolean clienteVIP = true;
        String cupom = "COMBO5";

        String nomeCombustivel = "";
        double precoLitro = 0;
        boolean opcaoValida = true;

        // litros positivos
        if (litros <= 0) {
            System.out.println("Erro: A quantidade de litros deve ser maior que zero.");
            opcaoValida = false;
        } else {
            switch (tipoCombustivel) {
                case 1:
                    nomeCombustivel = "Gasolina";
                    precoLitro = 5.89;
                    break;
                case 2:
                    nomeCombustivel = "Etanol";
                    precoLitro = 3.99;
                    break;
                case 3:
                    nomeCombustivel = "Diesel";
                    precoLitro = 6.19;
                    break;
                default:
                    opcaoValida = false;
                    System.out.println("Tipo de combustivel invalido");
                    break;
            }
        }

        if (opcaoValida) {
            double valorBruto = litros * precoLitro;
            double descontoVIP = 0.0;
            double descontoCupom = 0.0;

            // desconto cliente vip
            if (clienteVIP) {
                descontoVIP = valorBruto * 0.05;
            }

            // cupom de desconto
            if (cupom.equalsIgnoreCase("COMBO5")) {
                descontoCupom = valorBruto * 0.05;
            }

            double totalDescontos = descontoVIP + descontoCupom;
            double valorTotal = valorBruto - totalDescontos;

            System.out.println("=== RESUMO DO ABASTECIMENTO ===");
            System.out.println("Combustível escolhido: " + nomeCombustivel);
            System.out.println("Litros abastecidos: " + litros);
            System.out.println("Valor bruto: R$ " + String.format("%.2f", valorBruto));
            if (clienteVIP) {
                System.out.println("Desconto Cliente VIP (5%): -R$ " + String.format("%.2f", descontoVIP));
            }
            if (descontoCupom > 0) {
                System.out.println("Desconto Cupom (" + cupom + " - 5%): -R$ " + String.format("%.2f", descontoCupom));
            }
            System.out.println("Valor final a pagar: R$ " + String.format("%.2f", valorTotal));
        }
    }
}
