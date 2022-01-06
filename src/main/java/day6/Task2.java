package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2010, 500, 2000);

        plane1.setLength(560);
        plane1.setYear(2015);

        plane1.fillUp(500);
        plane1.fillUp(100);

        plane1.info();

    }
}
