import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        int c = (a % 5 == 0) ? 0 : 1;

        if (c == 0) System.out.println("Число " + a + " кратно 5");
        else System.out.println("Число " + a + " не кратно 5");

    }

}
