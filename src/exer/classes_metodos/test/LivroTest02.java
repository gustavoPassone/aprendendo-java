package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Livro;

public class LivroTest02 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;
        livro1.preco = 35.0;

        Livro livro2 = new Livro();
        livro2.titulo = "Guerra e Paz";
        livro2.autor = "Liev Tolstói";
        livro2.numeroPaginas = 1225;
        livro2.preco = 110.0;

        System.out.println(livro1.titulo + " (" + livro1.numeroPaginas + " págs): " + livro1.verificarTamanho());
        System.out.println(livro2.titulo + " (" + livro2.numeroPaginas + " págs): " + livro2.verificarTamanho());
    }
}

