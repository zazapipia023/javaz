package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("Group 1",
                2000,
                new ArrayList<>(Arrays.asList(new MusicArtist("Oliver", 20),
                        new MusicArtist("Jessy", 21)))));
        list.add(new MusicBand("Group 2",
                2012,
                new ArrayList<>(Arrays.asList(new MusicArtist("Egor", 18),
                        new MusicArtist("Anton", 22)))));

        System.out.println(list.get(0));
        list.get(0).printMembers();
        System.out.println(list.get(1));
        list.get(1).printMembers();
        MusicBand.transferMembers(list.get(0).getMembers(), list.get(1).getMembers());
        System.out.println(list.get(0));
        list.get(0).printMembers();
        System.out.println(list.get(1));
        list.get(1).printMembers();
    }
}
