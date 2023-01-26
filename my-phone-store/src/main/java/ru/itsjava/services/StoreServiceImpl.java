package ru.itsjava.services;

import ru.itsjava.domain.Phone;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Apple_iPhone_14_Pro", 92_500));
        phoneList.add(new Phone("Samsung_Galaxy_S21_FE_5G", 54_300));
        phoneList.add(new Phone("Google_Pixel_6_Pro", 49_950));
        phoneList.add(new Phone("OnePlus_9_Pro", 55_000));
        phoneList.add(new Phone("Xiaomi_Mi_11_Ultra", 57_700));

        PhoneService phoneService =  new PhoneServiceImpl(phoneList);

        ClientService clientService = new ClientServiceImpl(client, scanner, phoneService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.printMenu();

        menuService.menu();
    }

}
