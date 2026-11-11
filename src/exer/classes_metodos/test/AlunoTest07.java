package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;
import exer.classes_metodos.dominio.ComparadorAluno;

public class AlunoTest07 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Bianca";
        aluno1.nota1 = 7.0;
        aluno1.nota2 = 8.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Rodrigo";
        aluno2.nota1 = 9.0;
        aluno2.nota2 = 9.5;

        ComparadorAluno comparador = new ComparadorAluno();
        Aluno melhorAluno = comparador.retornarAlunoComMaiorMedia(aluno1, aluno2);

        System.out.println("Aluno 1: " + aluno1.nome + " - Média: " + aluno1.calcularMedia());
        System.out.println("Aluno 2: " + aluno2.nome + " - Média: " + aluno2.calcularMedia());
        System.out.println("Aluno com maior média: " + melhorAluno.nome);
    }
}

