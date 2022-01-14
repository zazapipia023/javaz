package day12.task4;

import java.util.ArrayList;
import java.util.List;

class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    MusicBand(String name, int year, ArrayList<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void setMember(String member) { members.add(member); }

    public void printMembers() { System.out.println(members); }

    public List<String> getMembers() { return members; }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(List<String> A, List<String> B) {
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
