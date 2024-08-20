import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();
        System.out.println("Введите число 3");
        int c = scanner.nextInt();

        System.out.println("Выбери действие:");
        System.out.println("1 - найти сумму чисел");
        System.out.println("2 - найти произведение чисел");

        int option = scanner.nextInt();

        if (option == 1) {

           int s = a + b + c;
           System.out.println("Сумма чисел равна " + s);

        } else {

            int p = a * b * c;
            System.out.println("Произведение чисел равно " + p);
        }
    }

}
