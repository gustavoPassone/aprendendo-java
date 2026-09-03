package flamingo.aprendendo;

import java.util.Scanner;

public class TabuadaFor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada: ");
        int numero = sc.nextInt();
        sc.close();

        for(int multiplicador = 1; multiplicador <= 10 ; multiplicador++) {
            System.out.println(multiplicador * numero);
        }
    }
}
