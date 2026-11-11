package exer.classes_metodos.dominio;

public class Funcionario {
    public String nome;
    public double salario;

    public double calcularBonus(double porcentagemBonus) {
        return salario * (porcentagemBonus / 100);
    }
}

