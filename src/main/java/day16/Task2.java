package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task2 {
    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            List<String> numbers = new ArrayList(List.of(line.split(" ")));
            double sum = 0;
            for (String number :
                    numbers) {
                sum += Double.parseDouble(number);
            }
            int sumInt = (int)sum;
            System.out.println(sumInt);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NoSuchElementException e) {
            System.out.println("Empty file");
        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }


    public static void main(String[] args) {
        String separator = File.separator;
        File dir = new File("D:" + separator + "JavaLearn" + separator + "JavaMarathon2021");
        File file1 = new File(dir, "file1.txt");
        File file2 = new File(dir, "file2.txt");


        try {
            if(file1.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");

            if(file2.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");

            Scanner scanner = new Scanner(file1);
            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            for (int i = 0; i < 1000; i++) {
                int tempNum = (int)(Math.random() * 100);
                pw1.print((String.valueOf(tempNum)) + " ");
                pw1.flush();
            }
            String line = scanner.nextLine();
            List<String> numbers = new ArrayList(List.of(line.split(" ")));

            double sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                sum += Integer.parseInt(numbers.get(i));
                if((i + 1) % 20 == 0) {
                    pw2.print(String.valueOf(sum / 20) + " ");
                    pw2.flush();
                    sum = 0;
                }
            }
            scanner.close();
            pw1.close();
            pw2.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(NoSuchElementException e) {
            System.out.println("Empty file");
        } catch(IOException e) {
            e.getMessage();
        }

        printResult(file2);
    }
}
