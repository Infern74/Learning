import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = sc.nextLine();
        switch (age) {
            case "Ноль":
                System.out.println("Лунтик");
                break;
            case "Семь":
                System.out.println("+11 лет хуйни start");
                break;
            case "Восемнадцать":
                System.out.println("Лютый плюс вайбик");
                break;
            default:
                System.out.println("Не придумал");
        }
    }
}
