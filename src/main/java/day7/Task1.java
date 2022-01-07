package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2010, 500, 1000);
        Airplane plane2 = new Airplane("Airbus A320", 2012, 501, 1000);
        Airplane.compareAirplanes(plane1, plane2);
    }
}