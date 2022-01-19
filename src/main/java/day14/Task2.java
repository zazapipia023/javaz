package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                people.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return people;
    }

    public static void main(String[] args) {
        String separator = File.separator;
        String path = "D:" + separator + "JavaLearn" + separator + "JavaMarathon2021" + separator + "people";
        File file = new File(path);
        List<String> people = new ArrayList<>();
        people = parseFileToStringList(file);
        System.out.println(people.toString());

    }
}
