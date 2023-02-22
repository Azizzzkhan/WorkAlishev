import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkMassive3 {
    public static void main(String[] args) {
        int[][] arrays = new int[12][8];

        Random random = new Random();

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(50);
            }
        }



    }
}