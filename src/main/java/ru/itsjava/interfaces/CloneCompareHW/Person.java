package ru.itsjava.interfaces.CloneCompareHW;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person person) {
        int result = surname.compareTo(person.surname);
        if (result == 0) {
//            System.out.println("Фамилии одинаковы, следовательно сравниваем имена!");
//            System.out.println("Если результат = 0, человек сравнивается сам с собой. Если результат меньше 0, значит имя первого человека лексикографически меньше имени второго человека. Если больше 0, то наоборот.");
            return name.compareTo(person.name);
        } else {
//            System.out.println("Фамилии разные, следовательно сравниваем разницу в возрасте!");
//            System.out.println("Если результат = 0, люди ровесники. Если ответ больше 0, то первый человек старше на итоговый результат. Если ответ меньше 0, значит возраст второго человека выше возраста первого человека на результат в модуле.");
            return (int) (age - person.age);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString(){
        return "Person {" + name + " " + surname + ", " + (int) age + "}";
    }

}
