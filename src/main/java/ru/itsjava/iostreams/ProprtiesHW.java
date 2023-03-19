package ru.itsjava.iostreams;

import java.io.*;
import java.util.Properties;

public class ProprtiesHW {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/app.properties");
        Properties props = new Properties();
        props.load(new FileInputStream(file));
        System.out.println("props.getProperty(\"daniil\") = " + props.getProperty("daniil"));

        ClassLoader classLoader = ProprtiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("app.properties");

        Properties propsFromStream = new Properties();
        propsFromStream.load(inputStream);
        System.out.println("propsFromStream.getProperty(\"daniil\") = " + propsFromStream.getProperty("daniil"));

    }

}
