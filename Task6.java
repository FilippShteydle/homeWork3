import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Число " + a + " отрицательное");
        } else if (a > 0) {
            System.out.println("Число " + a + " положительное");
        } else System.out.println("Число " + a + " равно нулю");
    }

}
