package flamingo.aprendendo.intermediario.dominio;

public class Carro {
    public String nome;
    public String marca;
    public int ano;
    public double velocidadeAtual;

    public boolean foiMultado() {
        return velocidadeAtual > 80;
    }

    public String msgMulta() {
        if (foiMultado()) {
            return "O carro foi multado!";
        }
        return "Voce esta no limite";
    };
}