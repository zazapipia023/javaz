package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("BMW");
        arrayList.add("Mercedes");
        arrayList.add("Audi");
        arrayList.add("Honda");
        arrayList.add("Suzuki");

        System.out.println(arrayList);

        arrayList.add(2, "Lada");
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
