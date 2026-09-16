package exercicios.SWITCH;

public class _9ServicoBanhoETosa {
    public static void main(String[] args) {
        int tipoServico = 3;
        int porteAnimal = 2;

        String nomeServico = "";
        String nomePorte = "";
        double valorTotal = 0;
        boolean valido = true;

        switch (tipoServico) {
            case 1:
                nomeServico = "Banho";
                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 40.00;
                        break;
                    case 2:
                        nomePorte = "Médio";
                        valorTotal = 55.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 70.00;
                        break;
                    default:
                        valido = false;
                        System.out.println("Porte do animal invalido");
                        break;
                }
                break;

            case 2:
                nomeServico = "Tosa";
                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 50.00;
                        break;
                    case 2:
                        nomePorte = "Medio";
                        valorTotal = 65.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 80.00;
                        break;
                    default:
                        valido = false;
                        System.out.println("Porte do animal invalido");
                        break;
                }
                break;

            case 3:
                nomeServico = "Banho e tosa";
                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 85.00;
                        break;
                    case 2:
                        nomePorte = "Medio";
                        valorTotal = 110.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 140.00;
                        break;
                    default:
                        valido = false;
                        System.out.println("Porte do animal invalido");
                        break;
                }
                break;

            default:
                valido = false;
                System.out.println("Serviço invalido");
                break;
        }

        if (valido) {
            System.out.println("Serviço escolhido: " + nomeServico);
            System.out.println("Porte do animal: " + nomePorte);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }
}
