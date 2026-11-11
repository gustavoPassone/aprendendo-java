package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Guilherme";
        pessoa.idade = 20;

        int idadeMinima = 18;
        boolean maior = pessoa.isMaiorDeIdade(idadeMinima);

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("É maior de idade (mínimo " + idadeMinima + " anos)? " + maior);
    }
}

