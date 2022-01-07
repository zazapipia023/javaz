package day7;

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ",");
        System.out.println("длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void fillUp(int n) {
        fuel += n;
    }

    static void compareAirplanes(Airplane plane1, Airplane plane2) {
        int length = plane1.length - plane2.length;
        if (length > 0) System.out.println("Самолёт " + plane1.manufacturer + " длиннее");
        if (length < 0) System.out.println("Самолёт " + plane2.manufacturer + " длиннее");
        if (length == 0) System.out.println("Самолёты равны по длине");
    }
}