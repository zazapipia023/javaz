package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 351; i +=2) {
            arrayList.add(i);
            if (i == 30) i = 298;
        }

        System.out.println(arrayList);
    }
}
