package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Phone;

import java.util.List;

@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {
    private final List<Phone> phonesFromStore;

    @Override
    public Phone getPhoneByModel(String name) {
        Phone resPhone = null;
        for (Phone phone : phonesFromStore) {
            if (phone.getModel().equals(name)) {
                resPhone = phone;
            }
        }
        if (resPhone != null) {
            phonesFromStore.remove(resPhone);
            return resPhone;
        }
        return resPhone;
    }

    @Override
    public void putPhone(Phone phone) {
        phonesFromStore.add(phone);
    }

    @Override
    public boolean hasPhone(String name) {
        for (Phone phone : phonesFromStore) {
            if (phone.getModel().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printPhones() {
        for (Phone phone : phonesFromStore) {
            System.out.println(phone.getModel() + " " + phone.getPrice());
        }
    }
}
