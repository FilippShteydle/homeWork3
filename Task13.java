import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название планеты");
        String planet = scanner.next();

       if (planet.equals("Земля")  || planet.equals("земля")) System.out.println("Привет, землянин!");
       else System.out.println("Привет, инопланетянин");
    }
}
