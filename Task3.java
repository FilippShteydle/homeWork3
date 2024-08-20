import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();
        System.out.println("Введите число 3");
        int c = scanner.nextInt();

        System.out.println("Выбери действие:");
        System.out.println("1 - вывести максимальное число");
        System.out.println("2 - вывести минимальное число");
        System.out.println("3 - вывести среднеарифметическое чисел");

        int option = scanner.nextInt();
        int max;
        int min;
        double sred;

        if (option == 1) {

            if (a > b && a > c) {
                max = a;
                System.out.println("Максимальное число равно " + max);

            } else
                if (b > a && b > c) {
                    max = b;
                    System.out.println("Максимальное число равно " + max);
                } else
                    if (c > a && c > b) {
                        max = c;
                        System.out.println("Максимальное число равно " + max);
                    }






        } else
            if (option == 2) {
                if (a < b && a < c) {
                    min = a;
                    System.out.println("Минимальное число равно " + min);

                } else
                    if (b < a && b < c) {
                        min = b;
                        System.out.println("Минимальное число равно " + min);
                    } else
                        if (c < a && c < b) {
                            min = c;
                            System.out.println("Минимальное число равно " + min);
                        }



            } else {
                sred = (a + b + c) / 3d;
                System.out.println("Среднеарифметическое чисел равно " + sred);
            }


    }

}
