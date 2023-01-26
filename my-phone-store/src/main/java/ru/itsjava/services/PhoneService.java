package ru.itsjava.services;

import ru.itsjava.domain.Phone;

public interface PhoneService {
    Phone getPhoneByModel(String name);

    void putPhone(Phone book);

    boolean hasPhone(String name);

    void printPhones();

}
