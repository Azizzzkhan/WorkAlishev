import java.util.Scanner;

public class IfScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a + 1;
        while (i < b){
            i ++;
            if(i % 5==0 && i % 10!=0)
                System.out.print(i + " ");
        }
    }
}
