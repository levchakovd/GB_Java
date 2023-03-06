package lesson1;
import java.util.Scanner;

public class les1_dz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите знак: +-/* ");
        String b = scanner.next();
        System.out.println("Введите второе число: ");
        int c = scanner.nextInt();

        if (b.equals("+")) {
            System.out.println(a + c);
        } else if (b.equals("-")) {
            System.out.println(a - c);
        } else if (b.equals("*")) {
            System.out.println(a * c);
        } else if (b.equals("/")) {
            System.out.print(a / c);
        } else {
            System.out.println("Некорректный знак");
        }
    }
}

