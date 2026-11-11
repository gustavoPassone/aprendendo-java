package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana Beatriz";
        aluno.nota1 = 8.5;
        aluno.nota2 = 9.0;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
    }
}

