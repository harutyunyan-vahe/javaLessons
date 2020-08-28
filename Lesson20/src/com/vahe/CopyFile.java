package com.vahe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String args[]) throws IOException {
        copyWithStreams();
    }

    public static void copyWithNio() throws IOException {

        //List<String> strings = Files.readAllLines(Paths.get("D:/input.txt"));

        byte[] bytes = Files.readAllBytes(Paths.get("D:/input.txt"));

//        String str = new String(bytes);
//        System.out.println(str);
        Files.write(Paths.get("D:/output.txt"), bytes);
    }

    public static void copyWithStreams() throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("D:/input.txt");
            out = new FileWriter("D:/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void copyWithStreamsTryWithResourceManagment() throws IOException {

        try (FileReader in = new FileReader("D:/input.txt");
             FileWriter out = new FileWriter("D:/output.txt")) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }

//        finally {
//            if (in != null) {
//                in.close();
//            }
//            if (out != null) {
//                out.close();
//            }
//        }

    }
}
