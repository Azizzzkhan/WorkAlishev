import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            double del1 = scanner.nextDouble();
            double del2 = scanner.nextDouble();
            count++;
            if (del2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(del1 / del2);

        }


    }
}

