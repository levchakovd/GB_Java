package lesson2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class les2_dz2 {
        public static void main(String[] args) {
        try {
            // создаем Scanner для чтения файла
            Scanner scanner = new Scanner(new File("input.txt"));

            while (scanner.hasNextLine()) {
                // считываем строку
                String line = scanner.nextLine();

                // разделяем строку на отдельные части
                String[] parts = line.split(",");

                // извлекаем нужные значения
                String surname = parts[0].split(":")[1].replaceAll("\"", "");
                String mark = parts[1].split(":")[1].replaceAll("\"", "");
                String subject = parts[2].split(":")[1].replaceAll("\"", "");

                // создаем StringBuilder и формируем строку в нужном формате
                StringBuilder sb = new StringBuilder();
                sb.append("Студент ");
                sb.append(surname);
                sb.append(" получил ");
                sb.append(mark);
                sb.append(" по предмету ");
                sb.append(subject);
                sb.append(".");
                System.out.println(sb.toString());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

