package ru.itsjava.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.statics.object.PhoneLombok;

@DisplayName("Класс PhoneLombok должен: ")
public class PhoneLombokTest {

    public static final String DEFAULT_MODEL = "iPhone 13 Pro Max";
    public static final int DEFAULT_STORAGE = 512;
    public static final boolean DEFAULT_MODUL5G = true;
    public static final boolean DEFAULT_NFC = true;
    public static final int CORRECTED_STORAGE = 256;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        PhoneLombok actualIphone = new PhoneLombok(DEFAULT_MODEL, DEFAULT_STORAGE, DEFAULT_MODUL5G, DEFAULT_NFC);

        Assertions.assertEquals(DEFAULT_MODEL, actualIphone.getModel());
        Assertions.assertEquals(DEFAULT_STORAGE, actualIphone.getStorage());
        Assertions.assertEquals(DEFAULT_MODUL5G, actualIphone.isModul5G());
        Assertions.assertEquals(DEFAULT_NFC, actualIphone.isNfc());
    }

    @DisplayName(" корректно изменять параметр памяти")
    @Test
    public void shouldHaveCorrectUpdatePhone(){
        PhoneLombok actualIphone = new PhoneLombok(DEFAULT_MODEL, DEFAULT_STORAGE, DEFAULT_MODUL5G, DEFAULT_NFC);
        actualIphone.setStorage(CORRECTED_STORAGE);
        Assertions.assertEquals(CORRECTED_STORAGE, actualIphone.getStorage());
    }

}
