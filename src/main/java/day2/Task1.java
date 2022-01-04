package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод этажа");
        int floor = in.nextInt();
        if(floor < 0) {
            System.out.println("Ошибка ввода");
        } else if (floor > 0 && floor < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floor > 4 && floor < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
