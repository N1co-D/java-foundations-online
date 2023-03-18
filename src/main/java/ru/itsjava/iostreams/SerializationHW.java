package ru.itsjava.iostreams;

import java.io.*;

public class SerializationHW {
    public static void main(String[] args) {

        User user1 = new User("user1", "12345");
        User user2 = new User("user2", "qwerty");
        User user3 = new User("user3", "java2023");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/users.out"))) {
            outputStream.writeObject(user1);
            outputStream.writeObject(user2);
            outputStream.writeObject(user3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/users.out"))) {
            Object user;
                while ((user = inputStream.readObject()) != null) {
                    System.out.println("user = " + user);
                }
        } catch (IOException | ClassNotFoundException ioException) {
            System.out.println();
            System.err.println("Возникает EOFException!");
            ioException.printStackTrace();
        }

    }

}
