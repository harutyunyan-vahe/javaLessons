package com.vahe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("D://WarAndPeace.txt"));
        String text = new String(bytes);

        String[] allWords = text.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : allWords) {
            //map.containsKey()
            Integer count = map.get(word);//O(1)
            if (count == null) {
                map.put(word, 1);//O(1)
            } else {
                map.put(word, count + 1);
            }
        }

        System.out.println(map);

    }
}
