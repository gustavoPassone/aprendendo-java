package flamingo.aprendendo.indroducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // byte: -128 a 127
        // short: -32.768 a 32.767
        // byte idade = 20;
        short idade = 130;
        int municipio = 11400000;
        long contaBancaria =  999999999999999999L;
        float salario = 15000.66f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'G';
        boolean vaiEstudar = true;
        System.out.println("-- Tipos Primitivos --");
        System.out.println("Minha idade é " + idade);
        System.out.println("São Paulo (SP): Mais de " + municipio + " milhões de moradores");
        System.out.println("Minha conta bancaria daqui a 5 anos: " + contaBancaria);
        System.out.println("Meu salario depois de estudar com bigas é: " + salario);
        System.out.println("PL caiu = " + salarioExtra);
        System.out.println("Primeira letra do meu nome é " + primeiraLetraDoNome);
        System.out.println(vaiEstudar);
    }
}
