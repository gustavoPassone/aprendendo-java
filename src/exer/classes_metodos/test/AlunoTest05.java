package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;

public class AlunoTest05 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Camila";
        aluno.nota1 = 8.5;
        aluno.nota2 = 9.0;

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.print("Situação: ");
        aluno.imprimirSituacao();
    }
}

