import java.util.ArrayList;
import java.util.List;

public class Main extends Human implements Walkable,Singable {
    public Main(String name, String surname, int age) {
        super(name, surname, age);
    }
    static List<Human> militaryMans = new ArrayList<>();
    static Man gosha = new Man("Гоша", "Чантурия", 26);
    static Man vitaliya = new Man("Виталя", "Нежинский", 29);
    static Man george = new Man("Гоша", "Купчинский", 17);
    Man petr = new Man("Петр", "Ярчер", 21);

    public static void main(String[] args) {
        militaryMans.add(gosha);
        militaryMans.add(vitaliya);
        militaryMans.add(george);

        for (Human man : militaryMans) {
            if (man.getAge() > 17 && man.getAge() < 27) {
                System.out.println(man);
            }
        }

    }

    @Override
    public void walk() {
        for (Human hum : militaryMans)
        if (getName() == "Гоша" && getSurname() == "Чантурия") {
            System.out.println("Гоша бегает!");
        }
    }

}
