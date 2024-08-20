import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();
        int num = 0;
        int res = 0;
        System.out.println("Введите знак (+ - * /)");
        String sym = scanner.next();

        if (sym.equals("+")) num = 1;
        else if (sym.equals("-")) num = 2;
        else if (sym.equals("*")) num = 3;
        else if (sym.equals("/")) num = 4;
        else System.out.println("Данную операцию выполнить невозможно");

        switch (num) {

            case 1 : res = a + b;
            break;
            case 2 : res = a - b;
            break;
            case 3 : res = a * b;
            break;
            case 4 : res = a / b;
            break;

        }
        System.out.println(res);

    }

}
