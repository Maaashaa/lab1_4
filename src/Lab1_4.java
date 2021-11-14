import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab1_4 {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = in.nextInt();
            switch (num) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Ошибка.Нет такого месяца. Необходимо число от 1 до 12");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введите целое число");
        }
    }
}
