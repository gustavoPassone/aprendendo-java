package exercicios.SWITCH;

public class PlanoAssinatura {
    public static void main(String[] args) {
        int plano = 2;
        int meses = 12;

        String nomePlano = "";
        double valorMensal = 0;
        boolean planoValido = true;

        switch (plano) {
            case 1:
                nomePlano = "Básico";
                valorMensal = 29.90;
                break;
            case 2:
                nomePlano = "Profissional";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                planoValido = false;
                System.out.println("Plano inválido");
                break;
        }

        if (planoValido) {
            double valorTotal = meses * valorMensal;
            double valorFinal = valorTotal;
            String descontoAplicado = "0%";

            if (meses == 12) {
                double desconto = valorTotal * 0.10;
                valorFinal = valorTotal - desconto;
                descontoAplicado = "10%";
            }

            System.out.println("Plano escolhido: " + nomePlano);
            System.out.println("Meses contratados: " + meses);
            System.out.println("Desconto aplicado: " + descontoAplicado);
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }
}
