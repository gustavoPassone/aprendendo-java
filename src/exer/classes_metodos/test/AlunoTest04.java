package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;

public class AlunoTest04 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Beatriz";
        aluno2.nota1 = 6.0;
        aluno2.nota2 = 5.5;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro";
        aluno3.nota1 = 3.0;
        aluno3.nota2 = 4.5;

        System.out.println(aluno1.nome + " - Média: " + aluno1.calcularMedia() + " - Situação: " + aluno1.getSituacao());
        System.out.println(aluno2.nome + " - Média: " + aluno2.calcularMedia() + " - Situação: " + aluno2.getSituacao());
        System.out.println(aluno3.nome + " - Média: " + aluno3.calcularMedia() + " - Situação: " + aluno3.getSituacao());
    }
}

