import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();

        int c = (a > b) ? a : b;
        System.out.println("Наибольшее число " + c);
    }

}
