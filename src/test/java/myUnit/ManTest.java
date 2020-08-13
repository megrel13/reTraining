package myUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Класс Man имеет:")
public class ManTest {

    @DisplayName("Корректный конструктор")
    @Test
    void shouldHaveCorrectConstructor() {
        Man man = new Man("Петро", "Жмыславович", 31);
        assertAll("man",
                () -> assertEquals(31, man.getAge(), "неправильный возраст"),
                () -> assertEquals("Петро", man.getName()),
                () -> assertEquals("Жмыславович", man.getSurname()));
    }

    @DisplayName("Корректная работа списка мужчин")
    @Test
    void shouldHaveCorrectManList() {
        List<Man> manList = new ArrayList<>();
        Man man = new Man("Джигурда", "Пьеха", 15);
        Man man1 = new Man("Салазар", "Слизерин", 120);
        Man man2 = new Man("Вася", "Пупкин", 23);

        manList.add(man);
        manList.add(man1);
        manList.add(man2);

        assertAll("ManList",
                () -> manList.contains(man),
                () -> manList.contains(man1),
                () -> manList.contains(man2));

    }

    @DisplayName("Корректная работа метода walk")
    @Test
    void shouldHaveCorrectWorkMethodWalk() {
        Man man = new Man("Гоша", "Чантурия", 26);
        man.walk();

        assertAll("man",
                () -> assertEquals(27, man.getAge(), "Неправильный возраст"));
    }

    @DisplayName("Корректная работа метода printWhoGoToArmy")
    @Test
    void shouldHaveCorrectWorkMethodPrintWhoGoToArmy() {
        Man man1 = new Man("Дима", "Грегорович", 23);
        Man man2 = new Man("Вася", "Крендель", 28);
        Man man3 = new Man("Петя", "Пушка", 17);

        man1.printWhoGoToArmy();
        man2.printWhoGoToArmy();
        man3.printWhoGoToArmy();

        assertAll("man",
                () -> assertEquals(23, man1.getAge(), "неправильный возраст"),
                () -> assertEquals(28, man2.getAge(), "непризывной возраст"),
                () -> assertEquals(17, man3.getAge(), "непризывной возраст"));

    }


}
