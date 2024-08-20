import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean h = false;
        boolean m = false;
        boolean s = false;

        int hour = 0;
        int minute = 0;
        int secunda = 0;

        while (!h) {
            System.out.println("Введите количество часов");
            hour = scanner.nextInt();
            if (hour >= 0 && hour < 24) h = true;
            else System.out.println("часы находятся не в диапазоне от 0 до 24");
        }

        while (!m) {
            System.out.println("Введите количество минут");
            minute = scanner.nextInt();
            if (minute >= 0 && minute < 60) m = true;
            else System.out.println("минуты находятся не в диапазоне от 0 до 60");
        }

        while (!s) {
            System.out.println("Введите количество секунд");
            secunda = scanner.nextInt();
            if (secunda >= 0 && secunda < 60) s = true;
            else System.out.println("секунды находятся не в диапазоне от 0 до 60");
        }

        System.out.println("Введенное время " + hour + " часов " + minute
                    + " минут " + secunda + " секунд");

    }

}
