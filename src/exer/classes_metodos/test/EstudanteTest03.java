package exer.classes_metodos.test;

import exer.classes_metodos.dominio.CadastroEstudante;
import exer.classes_metodos.dominio.Estudante;
import exer.classes_metodos.dominio.ImpressoraEstudante;

public class EstudanteTest03 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        CadastroEstudante cadastro = new CadastroEstudante();
        cadastro.cadastrar(estudante1, "Naruto Uzumaki", 17, 'M');
        cadastro.cadastrar(estudante2, "Hinata Hyuga", 16, 'F');

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        System.out.println("--- Estudante 1 ---");
        impressora.imprime(estudante1);

        System.out.println("\n--- Estudante 2 ---");
        impressora.imprime(estudante2);
    }
}

