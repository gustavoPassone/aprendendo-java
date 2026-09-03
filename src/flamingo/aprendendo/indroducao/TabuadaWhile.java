package flamingo.aprendendo.indroducao;

import java.util.Scanner;

public class TabuadaWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada:");
        int numero = sc.nextInt();
        sc.close();

        int contador = 1;
        while(contador <= 10) {
            System.out.println(contador * numero);
            contador++;
        }
    }
}
