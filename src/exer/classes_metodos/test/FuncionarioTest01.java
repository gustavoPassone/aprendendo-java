package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Roberto Alves";
        funcionario.salario = 4000.0;

        double porcentagemBonus = 15;
        double bonus = funcionario.calcularBonus(porcentagemBonus);

        System.out.println("Funcionário: " + funcionario.nome);
        System.out.println("Salário: R$ " + funcionario.salario);
        System.out.println("Bônus (" + porcentagemBonus + "%): R$ " + bonus);
    }
}

