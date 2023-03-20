package lesson2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class les2_dz1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        FileWriter writer = new FileWriter("log.txt");

        // Сортировка пузырьком
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Запись промежуточного результата в лог-файл
                    String log = "";
                    for (int k = 0; k < n; k++) {
                        log += arr[k] + " ";
                    }
                    log += "\n";
                    writer.write(log);
                }
            }
        }

        writer.close();

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

