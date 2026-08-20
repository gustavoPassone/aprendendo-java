package parte3;

public class Exer24 {
    public static void main(String[] args) {

        double temperatura = 28;

        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura <= 25) {
            System.out.println("Agradável");
        } else if (temperatura <= 35) {
            System.out.println("Quente");
        } else {
            System.out.println("Muito quente");
        }
    }
}
