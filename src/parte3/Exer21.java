package parte3;

public class Exer21 {
    public static void main(String[] args) {

        int idade = 25;

        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
