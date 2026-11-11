package exer.classes_metodos.dominio;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7;
    }

    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirSituacao() {
        System.out.println(getSituacao());
    }

    public void atualizarNotas(double novaNota1, double novaNota2) {
        this.nota1 = novaNota1;
        this.nota2 = novaNota2;
    }
}
