package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;

public class AlunoTest02 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Carlos";
        aluno.nota1 = 7.5;
        aluno.nota2 = 8.5;

        double media = aluno.calcularMedia();
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + media);
    }
}

