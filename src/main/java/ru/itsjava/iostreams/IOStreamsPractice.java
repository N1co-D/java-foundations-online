package ru.itsjava.iostreams;

import lombok.SneakyThrows;

import java.io.*;

public class IOStreamsPractice {
    @SneakyThrows
    public static void main(String[] args) {

//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {                                                                                //код, который может выкинуть эксептион
//            String input = console.readLine();
//            System.out.println("Your input = " + input);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        String input = console.readLine();
//        System.out.println("Your input = " + input);
//        console.close();


        //try with resources
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("Your input = " + input);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        File file = new File("src/main/resources/file.txt");
        try (
                PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("Строка 1");
            printWriter.println("Строка 2");
            printWriter.println("Строка 3");
        } catch (
                FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (
                BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }


    }

}
