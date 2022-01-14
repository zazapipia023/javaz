package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> list = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000)
                list.add(bands.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("Beatles", 1990));
        list.add(new MusicBand("213123", 2020));
        list.add(new MusicBand("fdgdsg", 1993));
        list.add(new MusicBand("fdsfsdfgggggs", 2012));
        list.add(new MusicBand("lkglklgg", 2001));
        list.add(new MusicBand("gdfgdffgf", 1990));
        list.add(new MusicBand("Bffffddds", 1990));
        list.add(new MusicBand("asassles", 1990));
        list.add(new MusicBand("aaaaes", 2021));
        list.add(new MusicBand("sadsadds", 1990));

        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(groupsAfter2000(list));
    }
}
