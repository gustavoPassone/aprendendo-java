package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Carro;

import java.util.Scanner;

public class CarroTest02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Digite o nome do carro");
        carro1.nome = sc.nextLine();

        System.out.println("Digite a marca do carro");
        carro1.marca = sc.nextLine();

        System.out.println("Digite o ano do carro");
        carro1.ano = sc.nextInt();

        System.out.println("Digite a velocidade do carro");
        carro1.velocidadeAtual = sc.nextInt();

        carro1.nome = "Civic";
        carro1.marca ="Honda";
        carro1.ano = 1999;
        carro1.velocidadeAtual = 150;

        carro2.nome = "Civic";
        carro2.marca ="Honda";
        carro2.ano = 2000;
        carro2.velocidadeAtual = 75;


        impressora.imprime(carro1);
        impressora.imprime(carro2);

    }
}
