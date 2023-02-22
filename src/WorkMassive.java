import java.util.Scanner;

public class WorkMassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int len = scanner.nextInt();
        int[] mass = new int[scanner.nextInt()];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 10));
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Длина массива:" + mass.length);

        int counter8 = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 8)
                counter8++;
        }
        System.out.println("Количество чисел больше 8: " + counter8);
        int counter1 = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1)
                counter1++;
        }
        System.out.println("Количество чисел равных 1: " + counter1);
        int counterchet = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]%2==0)
                counterchet++;
        }
        System.out.println("Количество четных чисел: " + counterchet);
        int countersum = 0;
        for (int i = 0; i < mass.length; i++) {
            countersum = countersum + mass[i];
        }
        System.out.println("Сумма всех элементов массива: " + countersum);
    }

}


