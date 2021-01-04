package com.vahe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromFileRunnable implements MyRunnable {
    @Override
    public void run() {

        try {
            String txt = new String(Files.readAllBytes(Paths.get("D:/lessons/employes.txt")));
            System.out.println(txt.substring(0, 10).toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
