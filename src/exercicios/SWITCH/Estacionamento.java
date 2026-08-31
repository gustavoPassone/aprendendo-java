package exercicios.SWITCH;

public class Estacionamento {
    public static void main(String[] args) {
        int tipoVeiculo = 2;
        int horas = 6;

        String nomeVeiculo = "";
        double valorPorHora = 0;
        boolean tipoValido = true;

        switch (tipoVeiculo) {
            case 1:
                nomeVeiculo = "Moto";
                valorPorHora = 5.00;
                break;
            case 2:
                nomeVeiculo = "Carro";
                valorPorHora = 10.00;
                break;
            case 3:
                nomeVeiculo = "Caminhonete";
                valorPorHora = 15.00;
                break;
            default:
                tipoValido = false;
                System.out.println("Tipo de veículo inválido");
                break;
        }

        if (tipoValido) {
            double taxaAdicional = 0.0;

            if (horas > 5) {
                taxaAdicional = 10.0;
            }

            double valorTotal = (horas * valorPorHora) + taxaAdicional;

            System.out.println("Veículo: " + nomeVeiculo);
            System.out.println("Horas estacionado: " + horas);
            System.out.println("Taxa adicional: R$ " + taxaAdicional);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }
}
