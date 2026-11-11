package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 150;
        professor.disciplina = "Artes Marciais";
        professor.salario = 5000.0;

        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Disciplina: " + professor.disciplina);
        System.out.println("Salário: R$ " + professor.salario);
    }
}

