package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Phone;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final PhoneService phoneService;

    @Override
    public void buyPhone() {
        System.out.println("Введите название модели смартфона!");
        String model = scanner.next();
        if(phoneService.hasPhone(model)){
            System.out.println("Осуществляется покупка...");
            phoneService.getPhoneByModel(model);
            System.out.println("Смартфон " + model + " куплен");
        } else {
            System.out.println("Такой модели нет.");
        }
    }

    @Override
    public void putPhone() {
        System.out.println("Введите название модели смартфона!");
        String model = scanner.next();
        System.out.println("Введите стоимость смартфона!");
        int price = scanner.nextInt();

        Phone phone = new Phone(model, price);
        phoneService.putPhone(phone);
    }

    @Override
    public void printPhones() {
        System.out.println("Уважаемый, " + client.getName() + "! Вот наши доступные смартфоны:");
        phoneService.printPhones();
    }
}
