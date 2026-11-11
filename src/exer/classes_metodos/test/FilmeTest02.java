package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Filme;

public class FilmeTest02 {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Avatar: O Caminho da Agua";
        filme.genero = "Ficção Científica";
        filme.duracaoMinutos = 192;
        filme.classificacaoIndicativa = "12 anos";

        System.out.println("Filme: " + filme.titulo);
        System.out.println("Duração: " + filme.duracaoMinutos + " minutos");
        System.out.println("É filme longo? " + filme.isFilmeLongo());
    }
}
