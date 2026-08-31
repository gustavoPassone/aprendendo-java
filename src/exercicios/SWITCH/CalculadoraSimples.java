package exercicios.SWITCH;

public class CalculadoraSimples {
    public static void main(String[] args) {
        int operacao = 1;
        double numero01 = 20;
        double numero02 = 10;

        String nomeOperacao = "";
        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case 1:
                nomeOperacao = "Soma";
                resultado = numero01 + numero02;
                break;
            case 2:
                nomeOperacao = "Subtração";
                resultado = numero01 - numero02;
                break;
            case 3:
                nomeOperacao = "Multiplicação";
                resultado = numero01 * numero02;
                break;
            case 4:
                nomeOperacao = "Divisão";
                if (numero02 == 0) {
                    System.out.println("Não é possível dividir por zero");
                    operacaoValida = false;
                } else {
                    resultado = numero01 / numero02;
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Operação inválida");
                break;
        }

        if (operacaoValida) {
            System.out.println("Operação escolhida: " + nomeOperacao);
            System.out.println("Resultado: " + resultado);
        }
    }
}
