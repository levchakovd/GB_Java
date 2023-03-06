package lesson1;
import java.util.Scanner;

public class les1_dz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число q: ");
        String q = scanner.next();
        System.out.print("Введите второе число w: ");
        String w = scanner.next();
        System.out.print("Введите третье число e: ");
        String e = scanner.next();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    boolean q0 = q.charAt(0) == '?';
                    boolean q1 = q.charAt(1) == '?';
                    boolean w0 = w.charAt(0) == '?';
                    boolean w1 = w.charAt(1) == '?';
                    boolean e0 = e.charAt(0) == '?';
                    boolean e1 = e.charAt(1) == '?';

                    if (q0) q = String.valueOf(i) + q.charAt(1);
                    if (q1) q = q.charAt(0) + String.valueOf(i);
                    if (w0) w = String.valueOf(j) + w.charAt(1);
                    if (w1) w = w.charAt(0) + String.valueOf(j);
                    if (e0) e = String.valueOf(k) + e.charAt(1);
                    if (e1) e = e.charAt(0) + String.valueOf(k);

                    if (Integer.parseInt(q) + Integer.parseInt(w) == Integer.parseInt(e)) {
                        System.out.println(q + " + " + w + " = " + e);
                    }
                }
            }
        }
    }
}
