package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player((int)(Math.random() * 10 + 90));
        Player player2 = new Player((int)(Math.random() * 10 + 90));
        Player player3 = new Player((int)(Math.random() * 10 + 90));
        Player player4 = new Player((int)(Math.random() * 10 + 90));
        Player player5 = new Player((int)(Math.random() * 10 + 90));
        Player player6 = new Player((int)(Math.random() * 10 + 90));

        Player.info();
        System.out.println(player1.stamina);

        while(player1.stamina != 0) {
            player1.run();
        }

        Player.info();
    }
}
