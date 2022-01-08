package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String num = "";

        for(int i = 0; i < 20001; i++) {
            num += i + " ";
        }
        System.out.println(num);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность в мс.: " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        StringBuilder num1 = new StringBuilder("");

        for(int i = 0; i < 20001; i++) {
            num1.append(i);
            num1.append(" ");
        }
        System.out.println(num1);
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность в мс.: " + (stopTime - startTime));
    }
}
