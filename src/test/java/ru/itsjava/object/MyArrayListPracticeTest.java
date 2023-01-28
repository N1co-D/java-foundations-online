package ru.itsjava.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arrayList.MyArrayList;

@DisplayName("Класс MyArrayListPracticeTest должен: ")
public class MyArrayListPracticeTest {

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

}
