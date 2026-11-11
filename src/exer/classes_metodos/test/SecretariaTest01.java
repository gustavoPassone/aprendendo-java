package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Aluno;
import exer.classes_metodos.dominio.Secretaria;

public class SecretariaTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Thiago";
        aluno.nota1 = 4.5;
        aluno.nota2 = 5.0;

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Notas antigas: " + aluno.nota1 + " e " + aluno.nota2);
        System.out.println("Situação antiga: " + aluno.getSituacao());

        Secretaria secretaria = new Secretaria();
        System.out.println("\nSecretaria atualizando notas para 8.0 e 7.5...");
        secretaria.atualizarAluno(aluno, 8.0, 7.5);

        System.out.println("Notas atualizadas: " + aluno.nota1 + " e " + aluno.nota2);
        System.out.println("Nova situação: " + aluno.getSituacao());
    }
}

