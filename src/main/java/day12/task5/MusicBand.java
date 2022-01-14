package day12.task5;

import java.util.ArrayList;
import java.util.List;

class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    MusicBand(String name, int year, ArrayList<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void setMember(MusicArtist member) { members.add(member); }

    public void printMembers() { System.out.println(members); }

    public List<MusicArtist> getMembers() { return members; }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(List<MusicArtist> A, List<MusicArtist> B) {
        while (!A.isEmpty()) {
            B.add(A.get(0));
            A.remove(0);
        }
    }

    @Override
    public String toString() {
        return name + " " + year;
    }
}
