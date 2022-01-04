package day4;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];

        int sum = 0, max = -1, index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10001);
        }

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length - 2; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            if(sum > max) {
                max = sum;
                index = i;
            }
            sum = 0;
        }

        System.out.println(max);
        System.out.println(index);
    }
}
