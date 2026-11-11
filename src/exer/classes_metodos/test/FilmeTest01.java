package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Interestelar";
        filme.genero = "Ficção Científica";
        filme.duracaoMinutos = 169;
        filme.classificacaoIndicativa = "10 anos";

        System.out.println("Título: " + filme.titulo);
        System.out.println("Gênero: " + filme.genero);
        System.out.println("Duração: " + filme.duracaoMinutos + " minutos");
        System.out.println("Classificação Indicativa: " + filme.classificacaoIndicativa);
    }
}

