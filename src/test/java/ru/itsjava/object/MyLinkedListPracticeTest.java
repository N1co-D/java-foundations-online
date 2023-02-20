package ru.itsjava.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.linkedList.MyLinkedList;

@DisplayName("Класс MyLinkedListPracticeTest должен: ")
public class MyLinkedListPracticeTest {

    @DisplayName(" считать размер списка")
    @Test
    public void shouldHaveCorrectMethodSize() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Bye");
        Assertions.assertEquals(list.size(), 2);
    }

    @DisplayName(" делать выводы о том, является ли список пустым")
    @Test
    public void shouldHaveCorrectMethodIsEmpty() {
        MyLinkedList listEmpty = new MyLinkedList();
        MyLinkedList listNotEmpty = new MyLinkedList();
        listNotEmpty.add("Hello");
        listNotEmpty.add("Bye");
        Assertions.assertTrue(listEmpty.isEmpty());
        Assertions.assertFalse(listNotEmpty.isEmpty());
    }

    @DisplayName(" проверять наличие элемента внутри списка")
    @Test
    public void shouldHaveCorrectMethodContains() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Bye");
        Assertions.assertTrue(list.contains("Hello"));
        Assertions.assertFalse(list.contains("Daniil"));
    }

    @DisplayName(" проверять добавление элемента внутрь списка")
    @Test
    public void shouldHaveCorrectMethodAdd() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Hello");
        Assertions.assertTrue(list.contains("Hello"));
    }

    @DisplayName(" проверять удаление элемента из списка")
    @Test
    public void shouldHaveCorrectMethodRemove() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.remove("Hello");
        Assertions.assertFalse(list.contains("Hello"));
    }

    @DisplayName(" очищать список")
    @Test
    public void shouldHaveCorrectMethodClear() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Bye");
        list.clear();
        Assertions.assertNull(list.get(0));
    }

    @DisplayName(" получать элемент списка по индексу")
    @Test
    public void shouldHaveCorrectMethodGet() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        Assertions.assertEquals(list.get(0), "Hello");
    }

    @DisplayName(" менять элемент списка по индексу")
    @Test
    public void shouldHaveCorrectMethodSet() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.set(0, "Bye");
        Assertions.assertEquals(list.get(0), "Bye");
    }

//    @DisplayName(" проверять добавление элемента внутрь списка по индексу")
//    @Test
//    public void shouldHaveCorrectMethodAddWithIndex() {
//        MyLinkedList list = new MyLinkedList();
//        list.add("Teacher");
//        list.add(0, "Student");
//        Assertions.assertTrue(list.isCorrectIndex(0));
//        Assertions.assertTrue(list.contains("Student"));
//    }

    @DisplayName(" проверять удаление элемента из списка по индексу")
    @Test
    public void shouldHaveCorrectMethodRemoveWithIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add("Student");
        list.remove(0);
        Assertions.assertFalse(list.contains("Student"));
    }

    @DisplayName(" проверять корректность индекса")
    @Test
    public void shouldHaveCorrectMethodIsCorrectIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Bye");
        Assertions.assertTrue(list.isCorrectIndex(1));
        Assertions.assertFalse(list.isCorrectIndex(2));
    }

    @DisplayName(" получать индекс по значению элемента списка")
    @Test
    public void shouldHaveCorrectMethodIndexOf() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Student");
        list.add("Bye");
        Assertions.assertEquals(list.indexOf("Hello"), 0);
        Assertions.assertEquals(list.indexOf("Student"), 1);
        Assertions.assertEquals(list.indexOf("Bye"), 2);
    }

    @DisplayName(" получать индекс последнего объекта по значению элемента списка")
    @Test
    public void shouldHaveCorrectMethodLastIndexOf() {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Bye");
        list.add("Hello");
        Assertions.assertEquals(list.lastIndexOf("Hello"), 2);
    }
}
