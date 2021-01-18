package com.vahe.regexp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

    public static void main(String[] args) throws IOException {
        // ? in regexp
//        String[] split = "vahe     harutyunyan   sdfsdfsd".split("\\s+");
//
////        System.out.println(Arrays.toString(split));
//
////
//        String replaced = "vahe   harutynyan    Test".replaceAll("\\s+", "#");
//        System.out.println(replaced);
////
//        System.out.println("vahe@gmail.com".matches("\\w+@\\w+\\.\\w+"));
//
//        Pattern pattern = Pattern.compile("\\[vV]ahe");
//
        testPatter();
    }

    public  static void testPatter() throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("D:/lessons/regexp.txt")));

        Pattern pattern = Pattern.compile("(\\d{4})-\\d{2}-\\d{2}");
//        Pattern pattern = new Pattern("");
//        LocalDate localDate = LocalDate.of()


        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }

    }
}
