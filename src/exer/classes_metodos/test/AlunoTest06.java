package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;

public class AlunoTest06 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Gabriel";
        aluno.nota1 = 4.0;
        aluno.nota2 = 5.0;

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Notas antigas: " + aluno.nota1 + " e " + aluno.nota2);
        System.out.println("Média antiga: " + aluno.calcularMedia());

        System.out.println("\nAtualizando notas para 8.0 e 9.0...");
        aluno.atualizarNotas(8.0, 9.0);

        System.out.println("Novas notas: " + aluno.nota1 + " e " + aluno.nota2);
        System.out.println("Nova média: " + aluno.calcularMedia());
    }
}

