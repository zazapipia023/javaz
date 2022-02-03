package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            String separator = File.separator;
            String path = "D:" + separator + "zz" + separator + "JavaMarathon2021" + separator +
                    "src" + separator + "main" + separator + "resources" + separator + "taxi_cars.txt";
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            Scanner in = new Scanner(System.in);
            HashMap<Integer, Point> map = new HashMap<>();
            Set<Integer> cars = new LinkedHashSet<>(500);

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] nums = line.split(" ");
                int x = Integer.parseInt(nums[1]);
                int y = Integer.parseInt(nums[2]);
                if(x > 99 || x < 0 || y > 99 || y < 0) throw new OutOfRangeException("x или y вне диапозона");
                map.put(Integer.parseInt(nums[0]), new Point(x, y));
            }

            System.out.println("Введите x1, y1, x2, y2");
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            for(Map.Entry<Integer, Point> car : map.entrySet()) {
                if(car.getValue().getX() > x1 & car.getValue().getY() < y1) {
                    if(car.getValue().getX() < x2 & car.getValue().getY() > y2) {
                        cars.add(car.getKey());
                    }
                }
            }

            System.out.println(cars);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (OutOfRangeException e) {
            System.out.println("x или y вне диапозона"); // на e.getMessage() консоль никакой реакции не выдаёт
        }

    }
}

