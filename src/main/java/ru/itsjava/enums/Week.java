package ru.itsjava.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Week {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private final String translation;

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Week{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
