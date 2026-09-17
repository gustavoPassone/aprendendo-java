package flamingo.aprendendo.basico;

public class ArraysParte06 {
    static void main(String[] args) {
        int[][] numeros = {{1, 2}, {4, 5, 6, 12}, {7, 8, 9, 5, 12, 22}};

        int[][] arrayInt = new int[3][];

        int[] array = {1, 2, 3, 4};
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};
    }
}
