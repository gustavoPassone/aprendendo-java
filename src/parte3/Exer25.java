package parte3;

public class Exer25 {
    public static void main(String[] args) {

        int xp = 7500;

        if (xp < 1000) {
            System.out.println("Iniciante");
        } else if (xp <= 4999) {
            System.out.println("Intermediário");
        } else if (xp <= 9999) {
            System.out.println("Avançado");
        } else {
            System.out.println("Lendário");
        }
    }
}
