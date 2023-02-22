import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город:");
        while (true) {
            String city = scanner.nextLine();
            if (city.equals("Stop")) {
                break;
            }
            switch (city) {
                case "Милан":
                case "Турин":
                case "Рим":
                    System.out.println("Милан");
                    break;
                case "Москва":
                case "Махачкала":
                case "Грозный":
                    System.out.println("Россия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}