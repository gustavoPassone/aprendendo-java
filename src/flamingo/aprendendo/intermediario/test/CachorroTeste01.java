package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Cachorro;

public class CachorroTeste01 {
    static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Montanha";

        System.out.println(cachorro1.nome);
        System.out.println(cachorro1.kilo);
        System.out.println(cachorro1.raca);
        System.out.println(cachorro1.idade);

        System.out.println("------------------");

        System.out.println(cachorro2.nome);
        System.out.println(cachorro2.kilo);
        System.out.println(cachorro2.raca);
        System.out.println(cachorro2.idade);
    }
}
