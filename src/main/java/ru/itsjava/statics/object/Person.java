package ru.itsjava.statics.object;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String name;
    private int age;

    public void birthsday() {
        age += 1;
    }

    public boolean takeBeer() {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

}
