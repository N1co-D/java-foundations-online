package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Phone;

@DisplayName("Класс должен:")
public class PhoneTest {
    public static final String DEFAULT_MODEL = "Apple_iPhone_14_Pro";
    public static final int DEFAULT_PRICE = 92_500;
    public static final int NEW_PRICE = 49_950;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstruction() {
        Phone phone = new Phone(DEFAULT_MODEL, DEFAULT_PRICE);
        Assertions.assertEquals(DEFAULT_MODEL, phone.getModel());
        Assertions.assertEquals(DEFAULT_PRICE, phone.getPrice());
    }

    @DisplayName(" корректно изменять параметр стоимости смартфона")
    @Test
    public void shouldHaveCorrectUpdatePhonePrice() {
        Phone phone = new Phone(DEFAULT_MODEL, DEFAULT_PRICE);
        phone.setPrice(NEW_PRICE);
        Assertions.assertEquals(NEW_PRICE, phone.getPrice());
    }

}
