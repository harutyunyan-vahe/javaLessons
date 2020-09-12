package com.vahe.back;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Phaser;

public class SetTest {

    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("D://WarAndPeace.txt"));
        String text = new String(bytes);

        String[] allWords = text.split("\\s+");

        Set<String> set =  new HashSet<>();//new HashSet<>(Arrays.asList(s));
        for (String word : allWords) {
            set.add(word);
        }


        System.out.println("All words count " + allWords.length);
        System.out.println("Uniqe word count " +set.size());

        System.out.println(set);

        System.out.println(set.contains("Armenia"));

        //hashSet.add("ss") // O(1)
        //hashSet.contains("ss"); O(1)
        //hashSet.remove("ss"); O(1)

    }
}
