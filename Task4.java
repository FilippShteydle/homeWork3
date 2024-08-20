import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количесво метров");
        int m = scanner.nextInt();

        System.out.println("Выбери действие:");
        System.out.println("1 - перевести метры в мили");
        System.out.println("2 - перевести метры в дюймы");
        System.out.println("3 - перевести метры в ярды");
        int option = scanner.nextInt();
        double mil;
        double yard;
        double duim;

        if (option == 1) {
            mil = m / 1609.34d;
            System.out.println("В " + m + " метрах содержится " + mil + " мили");

        } else if (option == 2) {

            duim = m * 39.37d;
            System.out.println("В " + m + " метрах содержится " + duim + " дюйма");
        } else {
            yard = m * 1.09d;
            System.out.println("В " + m + " метрах содержится " + yard + " ярда");
        }


    }

}
