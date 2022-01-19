package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            List<String> numbersString = new ArrayList<>(List.of(line.split(" ")));
            if (numbersString.size() < 10 || numbersString.size() > 10) {
                throw new ScannerException("Некорректный входной файл");
            }
            List<Integer> numbers = new ArrayList<>();

            for (String number:
                 numbersString) {
                numbers.add(Integer.parseInt(number));
            }

            int sum = 0;

            for (Integer number:
                 numbers) {
                sum += number;
            }
            System.out.println("Сумма - " + sum);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ScannerException e) {
            System.out.println("Некорректный входной файл");
        }

    }

    public static void main(String[] args) {
        String separator = File.separator;
        String path = "D:" + separator + "JavaLearn" + separator + "JavaMarathon2021" + separator + "text";
        File file = new File(path);
        printSumDigits(file);
    }
}
