package symCounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class NumOfCharacters {
    public void readFile() {
        try {
            File myFile = new File("D://Program Files/javaprojects/SymCounter", "loaded.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            Map<String, Integer> numOfChars = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    String temp = c + "";
                    if (!numOfChars.containsKey(temp)) {
                        numOfChars.put(temp, 1);
                    } else {
                        numOfChars.put(temp, numOfChars.get(temp) + 1);
                    }
                }
            }
            reader.close();
            for (Map.Entry entry : numOfChars.entrySet()) {
                System.out.println("Символ: " + entry.getKey() + " Количество: "
                        + entry.getValue());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

