package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max = -1, min = 10001, k = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10001);
        }

        for(int x:array) {
            if (x > max) max = x;
            if (x < min) min = x;
            if (x % 10 == 0) {
                k += 1;
                sum += x;
            }
        }

        System.out.println(max + " " + min + " " + k + " " + sum);
    }
}
