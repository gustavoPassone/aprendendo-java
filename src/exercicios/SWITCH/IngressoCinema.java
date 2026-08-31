package exercicios.SWITCH;

public class IngressoCinema {
    public static void main(String[] args) {
        int tipoIngresso = 3;
        int quantidade = 5;

        String nomeIngresso = "";
        double precoIngresso = 0;
        boolean ingressoValido = true;

        switch (tipoIngresso) {
            case 1:
                nomeIngresso = "Inteira";
                precoIngresso = 32.00;
                break;
            case 2:
                nomeIngresso = "Meia-entrada";
                precoIngresso = 16.00;
                break;
            case 3:
                nomeIngresso = "VIP";
                precoIngresso = 60.00;
                break;
            default:
                ingressoValido = false;
                System.out.println("Tipo de ingresso inválido");
                break;
        }

        if (ingressoValido) {
            double valorBruto = quantidade * precoIngresso;
            double valorFinal = valorBruto;
            String descontoAplicado = "0%";

            if (quantidade > 4) {
                double desconto = valorBruto * 0.05;
                valorFinal = valorBruto - desconto;
                descontoAplicado = "5%";
            }

            System.out.println("Tipo de ingresso: " + nomeIngresso);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Desconto aplicado: " + descontoAplicado);
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }
}
