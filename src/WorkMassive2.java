import java.util.Arrays;
import java.util.Random;

public class WorkMassive2 {
    public static void main(String[] args) {
        int[] arrays = new int[100];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10000);

        }
        System.out.print(Arrays.toString(arrays));
        int max = 0;
        for (int i : arrays) {
            if (i > max)
                max = i;
        }

        System.out.println();
        System.out.println("Наибольший элемент:" + max);
        int min = 1000;
        for (int i : arrays) {
            if (i < min)
                min = i;
        }
        System.out.println("Наименьший элемент:" + min);
        int num0 = 0;
        for (int i : arrays) {
            if (i % 10 == 0) num0++;
        }
        System.out.println("Количество элементов массива,оканчивающихся на 0:" + num0);
        int sum = 0;
        for (int i : arrays) {
            if (i % 10 == 0)
                sum += i;
        }
        System.out.println("Cумму элементов массива, оканчивающихся на 0:" + sum);


    }

}
