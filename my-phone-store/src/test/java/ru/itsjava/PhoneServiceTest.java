package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Phone;
import ru.itsjava.services.PhoneServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class PhoneServiceTest {
    public static final String DEFAULT_MODEL = "Apple_iPhone_14_Pro";
    public static final int DEFAULT_PRICE = 92_500;
    List<Phone> phoneList = new ArrayList<>();

    @DisplayName("Проверка метода GetPhoneByModel")
    @Test
    public void shouldHaveCorrectMethodGetPhoneByModel() {
        Phone phone = new Phone(DEFAULT_MODEL, DEFAULT_PRICE);
        phoneList.add(phone);
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList);
        Assertions.assertEquals(phone, phoneService.getPhoneByModel(DEFAULT_MODEL));
    }

    @DisplayName("Проверка метода PutPhone")
    @Test
    public void shouldHaveCorrectMethodPutPhone() {
        Phone phone = new Phone(DEFAULT_MODEL, DEFAULT_PRICE);
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList);
        phoneService.putPhone(phone);
        Assertions.assertEquals(phone, phoneList.get(0));
    }

    @DisplayName("Проверка метода HasPhone")
    @Test
    public void shouldHaveCorrectMethodHasPhone() {
        Phone phone = new Phone(DEFAULT_MODEL, DEFAULT_PRICE);
        phoneList.add(phone);
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList);
        Assertions.assertTrue(phoneService.hasPhone(DEFAULT_MODEL));
    }

}
