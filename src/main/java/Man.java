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
        for (Man man : militaryMans)
            if (getName() == "Гоша" && getSurname() == "Чантурия") {
                System.out.println("Гоша бегает!");
            }
    }

    public void printWhoGoToArmy() {
        for (Man man : militaryMans) {
            if (man.getAge() > 17 && man.getAge() < 27) {
                System.out.println(man);
            }
        }
    }
}
