import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колическтво часов");
        int hour = scanner.nextInt();

        if (hour >= 0 && hour < 6) {
            System.out.println("Good Night");
        }else  if (hour >= 6 && hour < 17) {
            System.out.println("Good Morning");
        } else System.out.println("Good Evening");



    }

}
