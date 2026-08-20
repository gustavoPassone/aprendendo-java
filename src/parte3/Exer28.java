package parte3;

public class Exer28 {
    public static void main(String[] args) {

        int plano = 2;

        if (plano == 1) {
            System.out.println("Plano Básico - R$ 29,90");
        } else if (plano == 2) {
            System.out.println("Plano Intermediário - R$ 59,90");
        } else if (plano == 3) {
            System.out.println("Plano Premium - R$ 99,90");
        } else {
            System.out.println("Plano inválido");
        }
    }
}
