package ru.itsjava.strings;

public class StringPractice {

    public static void main(String[] args) {
//        String name = "Timofey";
//        String copyname = "Timofey";
//
//        System.out.println("(name == copyname) = " + (name == copyname));
//
//        String constructorName = new String("Timofey");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//
//        String internConstructorName = constructorName.intern();
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));

        String str = "Я строка!";
        System.out.println("str.length() = " + str.length()); // Узнать длину строки
        System.out.println("str.isEmpty() = " + str.isEmpty()); // Проверка на то, пустая ли строка
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА")); // Проверка на соответствие строк с учётом регистра
        System.out.println("str.equalsIgnoreCase(\"Я строкА!\") = " + str.equalsIgnoreCase("Я строкА!")); // Проверка на соответствие строк без учёта регистра

        System.out.println("-----------------------------------------------------------------------------------------");

        String[] strs = str.split(" "); // Разбитие строки на массив из двух строк
        System.out.println(strs[0]);
        System.out.println(strs[1]);

        System.out.println("-----------------------------------------------------------------------------------------");

        StringBuilder builderStr = new StringBuilder(str); // Добавление символа в существующую строку
        for (int i = 0; i < 100; i++) {
            builderStr.append("!");
        }
        System.out.println("builderStr.toString() = " + builderStr.toString()); // Вывод строки

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("str.toUpperCase() = " + str.toUpperCase()); // Преобразование строки к верхнему регистру
        System.out.println("str.toLowerCase() = " + str.toLowerCase()); // Преобразование строки к нижнему регистру

        System.out.println("-----------------------------------------------------------------------------------------");

        char[] result = str.toCharArray(); // Преобразование строки к массиву
        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Element [" + i + "]: " + result[i]);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        StringBuilder correctedStr = new StringBuilder(str);
        System.out.println("correctedStr.insert(2,\"причудливая \") = " + correctedStr.insert(2, "причудливая ")); // Вставка символов в строку
        System.out.println("correctedStr.delete(2, 14) = " + correctedStr.delete(2, 14)); // Удаление символов из строки

    }

}
