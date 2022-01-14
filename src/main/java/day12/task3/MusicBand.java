package day12.task3;

class MusicBand {
    private String name;
    private int year;

    MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + " " + year;
    }
}
