package ru.itsjava.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.statics.object.Person;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String NEW_NAME = "Александр";
    public static final int NEW_AGE = 17;
    public static final String DEFAULT_NAME = "Иван";
    public static final int DEFAULT_AGE = 30;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstruction() {
        Person teacherOfGroup1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Assertions.assertEquals(DEFAULT_NAME, teacherOfGroup1.getName());
        Assertions.assertEquals(DEFAULT_AGE, teacherOfGroup1.getAge());
    }

    @DisplayName(" корректно изменять параметр имени человека")
    @Test
    public void shouldHaveCorrectUpdatePersonName() {
        Person teacherOfGroup1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
        teacherOfGroup1.setName(NEW_NAME);
        Assertions.assertEquals(NEW_NAME, teacherOfGroup1.getName());
    }

    @DisplayName(" корректно изменять параметр возраста человека")
    @Test
    public void shouldHaveCorrectUpdatePersonAge() {
        Person teacherOfGroup1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
        teacherOfGroup1.setAge(NEW_AGE);
        Assertions.assertEquals(NEW_AGE, teacherOfGroup1.getAge());
    }

    @DisplayName(" корректно изменять возраст человека в День Рождения")
    @Test
    public void shouldHaveCorrectUpdatePersonAgeIfBirthsday() {
        Person teacherOfGroup1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
        teacherOfGroup1.birthsday();
        Assertions.assertEquals(DEFAULT_AGE + 1, teacherOfGroup1.getAge());
    }

//    @DisplayName(" корректно проверять возраст человека перед покупкой пива")
//    @Test
//    public void shouldHaveCorrectCheckingPersonAgeForTakingBeer() {
//        Person teacherOfGroup1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
//        teacherOfGroup1.takeBeer();
//        if (DEFAULT_AGE > 18) {
//            Assertions.assertEquals(teacherOfGroup1.takeBeer(), true);
//        } else {
//            Assertions.assertEquals(teacherOfGroup1.takeBeer(), false);
//        }
//    }

//    @DisplayName(" корректно проверять возраст человека перед покупкой пива")
//    @Test
//    public void shouldHaveCorrectCheckingPersonAgeForTakingBeer() {
//        Person teacherOfGroup1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
//        teacherOfGroup1.takeBeer();
//        if (DEFAULT_AGE > 18) {
//            Assertions.assertTrue(teacherOfGroup1.takeBeer());
//        } else {
//            Assertions.assertFalse(teacherOfGroup1.takeBeer());
//        }
//    }

    @DisplayName(" корректно проверять возраст человека перед покупкой пива")
    @Test
    public void shouldHaveCorrectCheckingPersonAgeForTakingBeer() {
        Person actualTeacherOfGroup1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person newTeacherOfGroup1 = new Person(NEW_NAME, NEW_AGE);
        Assertions.assertTrue(actualTeacherOfGroup1.takeBeer());
        Assertions.assertFalse(newTeacherOfGroup1.takeBeer());
    }

}
