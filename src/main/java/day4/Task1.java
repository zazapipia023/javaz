package day4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size:  ");
        int n = in.nextInt();
        int[] array = new int[n];
        int b = 0, r = 0, even = 0, odd = 0, sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }

        for(int x:array) {
            System.out.print(x + " ");
            if (x > 8) {
                b += 1;
            }
            if (x == 1) {
                r += 1;
            }
            if (x % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            sum += x;
        }


        System.out.println();
        System.out.println("Length: " + array.length);
        System.out.println("> 8: " + b);
        System.out.println("= 1: " + r);
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
        System.out.println("sum: " + sum);
    }
}
