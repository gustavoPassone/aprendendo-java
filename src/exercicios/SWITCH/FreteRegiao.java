package exercicios.SWITCH;

public class FreteRegiao {
    public static void main(String[] args) {
        int regiao = 3;
        double valorProduto = 250;

        String nomeRegiao = "";
        double frete = 0;
        boolean regiaoValida = true;

        switch (regiao) {
            case 1:
                nomeRegiao = "Sudeste";
                frete = 20.00;
                break;
            case 2:
                nomeRegiao = "Sul";
                frete = 25.00;
                break;
            case 3:
                nomeRegiao = "Nordeste";
                frete = 35.00;
                break;
            case 4:
                nomeRegiao = "Norte";
                frete = 45.00;
                break;
            case 5:
                nomeRegiao = "Centro-Oeste";
                frete = 30.00;
                break;
            default:
                regiaoValida = false;
                System.out.println("Região inválida");
                break;
        }

        if (regiaoValida) {
            if (valorProduto >= 300.00) {
                frete = 0.0;
            }

            double valorFinal = valorProduto + frete;

            System.out.println("Região: " + nomeRegiao);
            System.out.println("Valor do produto: R$ " + valorProduto);
            System.out.println("Frete: R$ " + frete);
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }
}
