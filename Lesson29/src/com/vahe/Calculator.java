package com.vahe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Calculator {

    private static final String INPUT_FILE = "D://lessons/input.txt";
    private static final String OUTPUT_FILE = "D://lessons/output.txt";

    public static void calculateResult() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE));

        StringBuilder sb = new StringBuilder();
        for (String currentLine : lines) {

            String[] splitLine = currentLine.split(" ");
            String row = calculateResultForRow(splitLine);
            sb.append(row);
        }

        //nio
        Path path = Paths.get(OUTPUT_FILE);
        Files.write(path, sb.toString().getBytes());

//        File file = new File();
//        file.delete()


    }

    private static String calculateResultForRow(String[] splitedLine) {

        int firstNumber = Integer.parseInt(splitedLine[0].trim());
        int secondNumber = Integer.parseInt(splitedLine[2].trim());
        String sign = splitedLine[1];
        switch (sign) {
            case "+":
                return buildResult(firstNumber, sign, secondNumber, firstNumber + secondNumber);
            case "-":
                return buildResult(firstNumber, sign, secondNumber, firstNumber - secondNumber);
            case "*":
                return buildResult(firstNumber, sign, secondNumber, firstNumber * secondNumber);
            case "/":
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Number could not be 0 in case of /");
                }
                return buildResult(firstNumber, sign, secondNumber, firstNumber / secondNumber);
            default:
                throw new IllegalArgumentException("Illegal sign  " + sign);
        }

    }


    private static String buildResult(int firstNumber, String sign, int secondNumber, int result) {
        return firstNumber + " " + sign + " " + secondNumber + " == " + result + "\n";
    }


}
