package exercicios.SWITCH;

public class _13IngressoCinemaDesafio {
    public static void main(String[] args) {
        int tipoIngresso = 3;
        int quantidade = 2;
        int idadeCliente = 18;
        int classificacaoFilme = 16;
        boolean incluirComboPipoca = true;
        boolean membroClubeVIP = true;

        String nomeIngresso = "";
        double precoIngresso = 0;
        boolean ingressoValido = true;

        // validação de quantidade e verificação de limite de idade
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade de ingressos deve ser maior que zero.");
            ingressoValido = false;
        } else if (idadeCliente < classificacaoFilme) {
            System.out.println("Venda não autorizada: Idade do cliente (" + idadeCliente + " anos) é menor que a classificação indicativa do filme (" + classificacaoFilme + " anos).");
            ingressoValido = false;
        } else {
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
        }

        if (ingressoValido) {
            double valorIngressos = quantidade * precoIngresso;
            double descontoVIP = 0.0;
            double descontoGrupo = 0.0;

            // desconto para mais de 4 ingressos
            if (quantidade > 4) {
                descontoGrupo = valorIngressos * 0.05;
            }

            // desconto para VIP
            if (membroClubeVIP) {
                descontoVIP = valorIngressos * 0.15;
            }

            double totalIngressosComDesconto = valorIngressos - descontoGrupo - descontoVIP;

            // adicional de combo pipoca e bebida
            double valorCombos = 0.0;
            if (incluirComboPipoca) {
                double precoComboUnitario = 22.00;
                valorCombos = quantidade * precoComboUnitario;
            }

            double valorFinal = totalIngressosComDesconto + valorCombos;

            System.out.println("=== COMPRA DE INGRESSOS CINEMA ===");
            System.out.println("Tipo de ingresso: " + nomeIngresso);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Idade informada: " + idadeCliente + " anos (Classificação: " + classificacaoFilme + "+)");
            System.out.println("Valor bruto ingressos: R$ " + String.format("%.2f", valorIngressos));
            if (descontoGrupo > 0) {
                System.out.println("Desconto grupo (+4 ingressos - 5%): -R$ " + String.format("%.2f", descontoGrupo));
            }
            if (descontoVIP > 0) {
                System.out.println("Desconto Clube VIP (15%): -R$ " + String.format("%.2f", descontoVIP));
            }
            if (incluirComboPipoca) {
                System.out.println("Adicional Combo Pipoca (" + quantidade + "x): +R$ " + String.format("%.2f", valorCombos));
            }
            System.out.println("Valor final a pagar: R$ " + String.format("%.2f", valorFinal));
        }
    }
}
