package flamingo.aprendendo.intermediario.dominio;

public class Aluno {
    public String nome;
    public double nota;

    public boolean isAprovado() {
        return nota >= 7;
    }

    public String verificarConvite() {
        if(isAprovado()){
            return nome + "Foi aprovado e recebeu convite para a festa.";
        }
        return nome + "Não foi aprovado e não recebeu convite.";
    }
}
