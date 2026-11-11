package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J.R.R. Tolkien";
        livro1.numeroPaginas = 1200;
        livro1.preco = 89.90;

        Livro livro2 = new Livro();
        livro2.titulo = "O Hobbit";
        livro2.autor = "J.R.R. Tolkien";
        livro2.numeroPaginas = 310;
        livro2.preco = 49.90;

        System.out.println("--- Livro 1 ---");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Número de Páginas: " + livro1.numeroPaginas);
        System.out.println("Preço: R$ " + livro1.preco);

        System.out.println("\n--- Livro 2 ---");
        System.out.println("Título: " + livro2.titulo);
        System.out.println("Autor: " + livro2.autor);
        System.out.println("Número de Páginas: " + livro2.numeroPaginas);
        System.out.println("Preço: R$ " + livro2.preco);
    }
}

