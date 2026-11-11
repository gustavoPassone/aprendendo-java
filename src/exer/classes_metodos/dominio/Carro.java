package exer.classes_metodos.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;
    public double velocidadeAtual;

    public String verificarIdadeDoCarro() {
        if (ano < 2010) {
            return "Carro antigo";
        }
        return "Carro novo";
    }

    public boolean isMultado(int limiteDaVia) {
        return velocidadeAtual > limiteDaVia;
    }

    public String gerarMensagemMulta(int limiteDaVia) {
        if (isMultado(limiteDaVia)) {
            return "Passou do limite da via";
        }
        return "Não passou do limite da via";
    }

    public void imprimirMulta(int limiteDaVia) {
        if (isMultado(limiteDaVia)) {
            System.out.println("Você tem uma multa para pagar");
        } else {
            System.out.println("Zero multas");
        }
    }

    public void acelerar(double valor) {
        this.velocidadeAtual += valor;
    }

    public void frear(double valor) {
        this.velocidadeAtual -= valor;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }
}
