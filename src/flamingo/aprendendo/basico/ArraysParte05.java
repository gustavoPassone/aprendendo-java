package flamingo.aprendendo.basico;

public class ArraysParte05 {
    public void main(String[] args) {
        int[][] diasDosMeses = new int[12][31];

        diasDosMeses[0] = new int[31]; // janeiro
        diasDosMeses[1] = new int[28]; // fevereiro
        diasDosMeses[2] = new int[30]; // março
        diasDosMeses[3] = new int[31]; // abril
        diasDosMeses[4] = new int[30]; // maio
        diasDosMeses[5] = new int[31]; // junho
        diasDosMeses[6] = new int[30]; // julho
        diasDosMeses[7] = new int[31]; // agosto
        diasDosMeses[8] = new int[30]; // setembro
        diasDosMeses[9] = new int[31]; // outubro
        diasDosMeses[10] = new int[30]; // novembro
        diasDosMeses[11] = new int[31]; // dezembro

        for (int i = 0; i < diasDosMeses.length; i++) {
            for (int j = 0; j < diasDosMeses[i].length; j++) {
                diasDosMeses[i][j] = j + 1;
                System.out.println("Mes " + (i + 1) + " - Dia:" + diasDosMeses[i][j]);
            }
            System.out.println("--------------------------");
        }
    }
}
