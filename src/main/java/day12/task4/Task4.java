package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("Group 1",
                2010,
                new ArrayList<>(Arrays.asList("Oliver", "Jessy"))));
        list.add(new MusicBand("Group 2",
                2011,
                new ArrayList<>(Arrays.asList("Charlie", "John"))));

        list.get(0).printMembers();
        list.get(1).printMembers();

        MusicBand.transferMembers(list.get(0).getMembers(), list.get(1).getMembers());

        list.get(0).printMembers();
        list.get(1).printMembers();
    }
}
