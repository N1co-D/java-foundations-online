package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsHW {
    public static void main(String[] args) {

        File fileHW1 = new File("src/main/resources/fileHW1.txt");
        try (PrintWriter printWriter = new PrintWriter(fileHW1)) {
            printWriter.println("Строка 1");
            printWriter.println("Строка 2");
            printWriter.println("Строка 3");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List fileHW1List = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileHW1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                fileHW1List.add(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("fileHW1List = " + fileHW1List);

        File fileHW2 = new File("src/main/resources/fileHW2.txt");
        try (PrintWriter printWriter = new PrintWriter(fileHW2)) {
            printWriter.println("Строка A");
            printWriter.println("Строка B");
            printWriter.println("Строка C");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        List fileHW2List = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileHW2))) {
            String input;
            while ((input = reader.readLine()) != null) {
                fileHW2List.add(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("fileHW2List = " + fileHW2List);

        try (PrintWriter printWriter = new PrintWriter(fileHW1)) {
            for (int i = 0; i < fileHW2List.size(); i++) {
                printWriter.println(fileHW2List.get(i));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(fileHW2)) {
            for (int i = 0; i < fileHW1List.size(); i++) {
                printWriter.println(fileHW1List.get(i));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileHW1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }
        } catch (
                IOException exception) {
            exception.printStackTrace();
        }

        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileHW2))) {
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
