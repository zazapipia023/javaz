package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Ford Focus");
        car1.setColor("White");
        car1.setYearCreated(2011);

        System.out.println("Car model is " + car1.getModel());
        System.out.println("Car color is " + car1.getColor());
        System.out.println("Car year is " + car1.getYearCreated());
    }
}
