package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path1 = "D:" + separator + "JavaLearn" + separator + "JavaMarathon2021" + separator + "src" +
                separator + "main" + separator + "resources" + separator + "shoes.csv";
        String path2 = "D:" + separator + "JavaLearn" + separator + "JavaMarathon2021" + separator + "src" +
                separator + "main" + separator + "resources" + separator + "missing_shoes";
        File file1 = new File(path1);
        File file2 = new File(path2);
        Scanner scanner = null;
        try {
            PrintWriter pw = new PrintWriter(file2);
            scanner = new Scanner(file1);
            if(file1.length() == 0) throw new EmptyFileException("Файл пустой");

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoe = line.split(";");
                if (shoe.length != 3) throw new ArrayIndexOutOfBoundsException();

                if (Integer.parseInt(shoe[2]) == 0) {
                    pw.print(shoe[0] + ", " + shoe[1] + ", " + shoe[2] + "\n");
                }
            }
            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (EmptyFileException e) {
            System.out.println("Файл пустой");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В файле не 3 столбца");
        }
    }
}
