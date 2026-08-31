package flamingo.aula.revisao.basico;
import java.time.LocalDate;

public class ExercicioPrimitivos {
    public static void main(String[] args) {
        String nome = "Gustavo";
        String endereco = "Rua 2";
        float salario = 10000.50f;
        LocalDate data = LocalDate.now();

        System.out.println("Eu " + nome + " morando no endereço " + endereco + ", confimo salario de " + salario + " na data " + data);
        System.out.printf("Eu %s morando no endereço %s, confimo salario de %.2f na data %s data", nome, endereco, salario, data);
    }
}
