import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Х");
        int x = scanner.nextInt();
        System.out.println("Введите координату У");
        int y = scanner.nextInt();

        if (x > 0 && y > 0 ) System.out.println("Координаты: Х = " + x + " У = " + y + " Относятся к первой четверти");
        else if (x < 0 && y > 0) System.out.println("Координаты: Х = " + x + " У = " + y + " Относятся ко второй четверти");
        else if (x < 0 && y < 0) System.out.println("Координаты: Х = " + x + " У = " + y + " Относятся к третьей четверти");
        else if (x > 0 && y < 0) System.out.println("Координаты: Х = " + x + " У = " + y + " Относятся к четвертой четверти");
        else if (x == 0 && y != 0) System.out.println("Координаты: Х = " + x + " У = " + y + " Находятся на оси X");
        else if (y == 0 && x != 0) System.out.println("Координаты: Х = " + x + " У = " + y + " Находятся на оси Y");
        else    System.out.println("Координаты: Х = " + x + " У = " + y + " находятся в начале координат");

    }

}
