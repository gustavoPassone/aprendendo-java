package exer.classes_metodos.dominio;

public class Filme {
    public String titulo;
    public String genero;
    public int duracaoMinutos;
    public String classificacaoIndicativa;

    public boolean isFilmeLongo() {
        return duracaoMinutos > 120;
    }
}
