package myUnit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Man implements Walkable, Singable {
    private final String name;
    private final String surname;
    private int age;

    @Override
    public void walk() {
        if (getName() == "Гоша" && getSurname() == "Чантурия") {
            age++;
            System.out.println("Гоша бегает!");
        }
    }

    public void printWhoGoToArmy() {
        if (getAge() > 17 && getAge() < 27) {
            System.out.println(getSurname());
        }
    }

}