package myUnit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Man> militaryMans = new ArrayList<>();
        Man gosha = new Man("Гоша", "Чантурия", 26);
        Man vitaliya = new Man("Виталя", "Нежинский", 29);
        Man george = new Man("Гоша", "Купчинский", 17);
        Man petr = new Man("Петр", "Ярчер", 21);
        militaryMans.add(gosha);
        militaryMans.add(vitaliya);
        militaryMans.add(george);
        militaryMans.add(petr);

        for (Man man : militaryMans) {
            man.walk();
            man.printWhoGoToArmy();
        }
    }
}


