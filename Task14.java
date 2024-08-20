import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int mon = scanner.nextInt();

        switch (mon) {

            case 1 :
                System.out.println("Месяц январь");
                break;
            case 2 :
                System.out.println("Месяц февраль");
                break;
            case 3 :
                System.out.println("Месяц март");
                break;
            case 4 :
                System.out.println("Месяц апрель");
                break;
            case 5 :
                System.out.println("Месяц май");
                break;
            case 6 :
                System.out.println("Месяц июнь");
                break;
            case 7 :
                System.out.println("Месяц июль");
                break;
            case 8 :
                System.out.println("Месяц август");
                break;
            case 9 :
                System.out.println("Месяц сентябрь");
                break;
            case 10 :
                System.out.println("Месяц октябрь");
                break;
            case 11 :
                System.out.println("Месяц ноябрь");
                break;
            case 12 :
                System.out.println("Месяц декабрь");
                break;


        }

    }

}
