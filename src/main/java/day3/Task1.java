package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter city");
        String city = in.nextLine();
        switch(city) {
            case "Москва":
                System.out.println("Россия");
                break;
            case "Владивосток":
                System.out.println("Россия");
                break;
            case "Ростов":
                System.out.println("Россия");
                break;

        }
    }
}
