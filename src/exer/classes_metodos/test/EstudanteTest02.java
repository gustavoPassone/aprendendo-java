package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Estudante;
import exer.classes_metodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Midoriya";
        estudante1.idade = 16;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Uraraka";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        System.out.println("--- Estudante 1 ---");
        impressora.imprime(estudante1);

        System.out.println("\n--- Estudante 2 ---");
        impressora.imprime(estudante2);
    }
}

