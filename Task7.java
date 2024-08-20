import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        int age = scanner.nextInt();

        if (age > 0 && age < 120) System.out.println("Вам " + age + " лет");
        else System.out.println("Возраст введен не корректно");

    }

}
