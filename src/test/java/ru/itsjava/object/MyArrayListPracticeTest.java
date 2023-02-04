package ru.itsjava.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arrayList.MyArrayList;

@DisplayName("Класс MyArrayListPracticeTest должен: ")
public class MyArrayListPracticeTest {

    @DisplayName(" считать размер массива")
    @Test
    public void shouldHaveCorrectMethodSize() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Bye");
        int size = 0;
        for (int i = 0; i < list.size(); i++) {
            size++;
        }
        Assertions.assertEquals(list.size(), size);
    }

    @DisplayName(" делать выводы о том, является ли массив пустым")
    @Test
    public void shouldHaveCorrectMethodIsEmpty() {
        MyArrayList listEmpty = new MyArrayList();
        MyArrayList listNotEmpty = new MyArrayList();
        listNotEmpty.add("Hello");
        listNotEmpty.add("Bye");
        Assertions.assertEquals(listEmpty.isEmpty(), true);
        Assertions.assertEquals(listNotEmpty.isEmpty(), false);
    }

    @DisplayName(" проверять наличие элемента внутри массива")
    @Test
    public void shouldHaveCorrectMethodContains() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Bye");
        Assertions.assertEquals(list.contains("Hello"), true);
        Assertions.assertEquals(list.contains("Daniil"), false);
    }

    @DisplayName(" проверять добавление элемента внутрь массива")
    @Test
    public void shouldHaveCorrectMethodAdd() {
        MyArrayList list = new MyArrayList();
        Assertions.assertEquals(list.add("Hello"), list.contains("Hello"));
    }

    @DisplayName(" проверять удаление элемента из массива")
    @Test
    public void shouldHaveCorrectMethodRemove() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        Assertions.assertEquals(list.remove("Hello"), !list.contains("Hello"));
    }

    @DisplayName(" очищать массив")
    @Test
    public void shouldHaveCorrectMethodClear() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Bye");
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            Assertions.assertEquals(list.get(i), null);
        }
    }

    @DisplayName(" получать элемент массива по индексу")
    @Test
    public void shouldHaveCorrectMethodGet() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        Assertions.assertEquals(list.get(0), "Hello");
    }

    @DisplayName(" менять элемент массива по индексу")
    @Test
    public void shouldHaveCorrectMethodSet() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        Assertions.assertEquals(list.set(0, "Bye"), "Bye");
    }

    @DisplayName(" проверять добавление элемента внутрь массива по индексу")
    @Test
    public void shouldHaveCorrectMethodAddWithIndex() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Bye");
        list.add(1, "Student");
        Assertions.assertEquals(list.contains("Student"), true);
    }

    @DisplayName(" проверять удаление элемента из массива по индексу")
    @Test
    public void shouldHaveCorrectMethodRemoveWithIndex() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Bye");
        Assertions.assertEquals(list.remove(1), "Bye");
    }

    @DisplayName(" проверять корректность индекса")
    @Test
    public void shouldHaveCorrectMethodIsCorrectIndex() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Bye");
        Assertions.assertEquals(list.isCorrectIndex(1), true);
        Assertions.assertEquals(list.isCorrectIndex(2), false);
    }

    @DisplayName(" получать индекс по значению элемента массива")
    @Test
    public void shouldHaveCorrectMethodIndexOf() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Student");
        list.add("Bye");
        Assertions.assertEquals(list.indexOf("Hello"), 0);
        Assertions.assertEquals(list.indexOf("Student"), 1);
        Assertions.assertEquals(list.indexOf("Bye"), 2);
    }

    @DisplayName(" получать индекс последнего объекта по значению элемента массива")
    @Test
    public void shouldHaveCorrectMethodLastIndexOf() {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("Bye");
        list.add("Hello");
        Assertions.assertEquals(list.lastIndexOf("Hello"), 2);
    }

}
