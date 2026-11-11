package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;

public class AlunoTest03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Mariana";
        aluno.nota1 = 6.5;
        aluno.nota2 = 8.0;

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Aprovado: " + aluno.isAprovado());
    }
}

