package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Celular;

public class CelularTest01 {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.marca = "Samsung";
        celular.modelo = "S25";
        celular.armazenamento = "256GB";
        celular.preco = 4500.0;

        System.out.println("Celular " + celular.marca + " " + celular.modelo + " com " + celular.armazenamento + " custa R$ " + celular.preco);
    }
}

