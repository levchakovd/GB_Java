package lesson1;
import java.util.Scanner;

public class les1_dz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int triangleNumber = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            triangleNumber +=i;
            factorial *=i;
        }

        System.out.println("Треугольное число 1 + 2 + ... + " + n + " = " + triangleNumber);
        System.out.println("n! = " + factorial);
    }
}
