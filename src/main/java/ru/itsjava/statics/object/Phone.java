package ru.itsjava.statics.object;

public class Phone {
    private final String model;
    private int storage;
    private boolean modul5G;
    private boolean nfc;

    public Phone(String model, int storage, boolean modul5G, boolean nfc) {
        this.model = model;
        this.storage = storage;
        this.modul5G = modul5G;
        this.nfc = nfc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Возвращает true при сравнении объекта самим с собой
        if (o == null || getClass() != o.getClass())
            return false; // Возвращает false при сравнении объектов из разных классов

        Phone phone = (Phone) o; // Приводит тип данных к классу Phone для дальнейшей работы (сравнения) компилятора

        if (storage != phone.storage) return false; // Возвращает false при отсутствии совпадений параметра памяти
        if (modul5G != phone.modul5G) return false; // Возвращает false при отсутствии совпадений наличия 5G
        if (nfc != phone.nfc) return false; // Возвращает false при отсутствии совпадений наличия NFC
        return model.equals(phone.model); // Возвращает результат true/false при сравнении моделей смартфонов
    }

    @Override
    public int hashCode() {
        return model.hashCode(); // Возвращает хэшкод объекта
    }

    @Override
    public String toString() {
        return "Phone:{модель: " + model + ", объем памяти: " + storage + " Гб, наличие 5G: " + modul5G + ", наличие NFC: " + nfc + "}";
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isModul5G() {
        return modul5G;
    }

    public void setModul5G(boolean modul5G) {
        this.modul5G = modul5G;
    }

    public boolean isNfc() {
        return nfc;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }
}
