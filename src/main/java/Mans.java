import java.util.ArrayList;
import java.util.List;

public class Mans {
    public static final List<Human> MANS = new ArrayList<>();

    public Mans() {
        Human gosha = new Man("Гоша", "Чантурия", 26);
        Human vitalia = new Man("Виталя", "Нежинский", 29);
        Human sergei = new Man("Сергей", "Терентьев", 17);
        MANS.add(gosha);
        MANS.add(vitalia);
        MANS.add(sergei);

    }

    public void printMilitarian() {
        for (Human hum : MANS) {
            if (hum.getAge() >= 18 && hum.getAge() < 27) {
                System.out.println(hum);
            }
        }
    }

}
