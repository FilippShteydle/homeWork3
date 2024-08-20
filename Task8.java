import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number < 0) System.out.println("Модуль числа " + number + " равен " + -number);
        else System.out.println("Модуль числа " + number + " равен " + number);

    }

}
