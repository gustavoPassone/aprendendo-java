package flamingo.aprendendo.basico.repeticao;

public class Exercicio9 {
    // Crie uma variável int tentativas.
    //
    //O programa deve simular tentativas de login.
    //
    //Enquanto o número de tentativas for menor que 3, exiba:
    //
    //Tentando fazer login...
    //
    //Quando atingir 3 tentativas, exiba:
    //
    //Número máximo de tentativas atingido
    static void main(String[] args) {
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.println("Tentando fazer login...");
            tentativas++;
        }
        System.out.println("Número máximo de tentativas atingido");
    }
}
