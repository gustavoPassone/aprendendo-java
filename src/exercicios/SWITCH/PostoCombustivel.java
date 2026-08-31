package exercicios.SWITCH;

public class PostoCombustivel {
    public static void main(String[] args) {
        int tipoCombustivel = 1;
        double litros = 10;

        String nomeCombustivel = "";
        double precoLitro = 0;
        boolean opcaoValida = true;

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
                System.out.println("Tipo de combustível inválido");
                break;
        }

        if (opcaoValida) {
            double valorTotal = litros * precoLitro;

            System.out.println("Combustível escolhido: " + nomeCombustivel);
            System.out.println("Litros abastecidos: " + litros);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }
}
