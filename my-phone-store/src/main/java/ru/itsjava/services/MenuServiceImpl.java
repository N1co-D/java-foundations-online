package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true) {
            System.out.println("Введите номер меню!");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.println("Вы выбрали купить смартфон!");
                clientService.buyPhone();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали сдать смартфон на диагностику!");
                clientService.putPhone();
            } else if (menuNum == 3) {
                System.out.println("Печатаем доступный перечень моделей...");
                clientService.printPhones();
            } else {
                System.out.println("Хорошего дня! Приходите к нам снова!");
                break;
            }
        }
    }

    @Override
    public void printMenu() {
        System.out.println("Команды меню:");
        System.out.println("1 - купить смартфон;");
        System.out.println("2 - сдать смартфон на диагностику;");
        System.out.println("3 - показать перечень доступных моделей смартфонов;");
        System.out.println("Прочие команды - выход из меню.");
    }
}
