package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();

        aluno01.nome = "Isac";
        aluno01.nota = 8.5;

        System.out.println("Aluno: " + aluno01.nome);
        System.out.println("Nota: " + aluno01.nota);
        System.out.println("Aprovado: " + aluno01.isAprovado());
        System.out.println(aluno01.verificarConvite());
    }
}
