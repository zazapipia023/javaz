package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike bike1 = new Motorbike("BMW", "Black", 2000);
        car1.setYearCreated(2022);

        car1.info();
        System.out.println(car1.yearDifference(2000));
        car1.setYearCreated(2002);
        System.out.println(car1.yearDifference(2010));

        bike1.info();
        System.out.println(bike1.yearDifference(2000));
    }
}
