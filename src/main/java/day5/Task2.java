package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike("Honda", "White", 2019);
        System.out.println("Model: " + bike1.getModel() + " | Color: " + bike1.getColor() + " | year: " + bike1.getYear());
    }
}
