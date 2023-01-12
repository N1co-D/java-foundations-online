package ru.itsjava.interfaces.CloneCompareHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable {
    private String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person person) {
        if (surname == person.surname) {
            return 0;
        } else {
            return 1;
        }
    }
}

//1. Создать класс Person ( Поля: Имя, Фамилия и возраст)
//2. Реализовать интерфейс Comparable. Реализовать метод compareTo(), который будет сравнивать человека по фамилии,
//   если фамилии одинаковые, то по имени, в ином случае по возрасту.
//3. В классе Main добавить в массив несколько человек. Отсортировать и вывести на экран.
//4. В классе Person реализовать метод clone()
//5. В классе Main создать клона некоторого Person.
