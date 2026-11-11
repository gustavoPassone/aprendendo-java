package exer.classes_metodos.dominio;

public class Celular {
    public String marca;
    public String modelo;
    public String armazenamento;
    public double preco;

    public boolean isPremium() {
        return preco >= 4000;
    }
}
