package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            String separator = File.separator;
            File text = new File("D:" + separator + "zz" + separator + "JavaMarathon2021" + separator +
                    "src" + separator + "main" + separator + "resources" + separator + "dushi.txt");
            Scanner scanner = new Scanner(text); // в text находится файл dushi.txt
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            HashMap<String, Integer> words = new HashMap<>();
            Set<String> wordsTop = new LinkedHashSet<>(100);
            int wordsCounter = 0, tempMax = 0, lastMax = 99999;
            String wordTemp = null;


            while(scanner.hasNext()) {
                String word = scanner.next();
                if (words.containsKey(word)) {
                    words.put(word, words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            }

//            for(Map.Entry<String, Integer> entry : words.entrySet()) {
//                if ("Чичиков".equals(entry.getKey())) ch = entry.getValue();
//            }
//            System.out.println(ch);
//            Чичиков - 601

            while(wordsCounter != 100) {
                for(Map.Entry<String, Integer> entry : words.entrySet()) {
                    if(entry.getValue() > tempMax & entry.getValue() < lastMax) {
                        wordTemp = entry.getKey();
                        tempMax = entry.getValue();
                    }
                }
                lastMax = tempMax;
                tempMax = 0;
                wordsTop.add(wordTemp);
                wordsCounter++;
            }
                System.out.println(wordsTop);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
