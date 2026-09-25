package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite um numero: ");
        int numero01 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int numero02 = sc.nextInt();

        int numero = 50;

        calculadora.soma();
        calculadora.subtrair();
        calculadora.multiplicar(numero01, numero02);
    }
}
