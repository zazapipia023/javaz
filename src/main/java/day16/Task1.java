package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    public static void printResult(File file) {
        try {
            double i = 0, sum = 0;
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            List<String> numbers = new ArrayList(List.of(line.split(" ")));

            for (String number:
                    numbers) {
                sum += Double.parseDouble(number);
                i += 1;
            }

            System.out.printf((sum / i) + " --> " + "%.3f",(sum / i));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NoSuchElementException e) {
            System.out.println("Пустой файл");
        }
    }

    public static void main(String[] args) {
        String separator = File.separator;
        String path = "D:" + separator + "JavaLearn" + separator + "JavaMarathon2021" + separator + "text";
        File file = new File(path);
        printResult(file);
    }
}

