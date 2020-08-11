import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Human {
    private final String name;
    private final String surname;
    private final int age;


    //   public void printMilitarian() {
    //       for (Human hum : Mans.MANS) {
    //           if (hum.getAge() >= 18 && hum.getAge() < 27) {
    //               System.out.println(hum);
    //           }
    //       }
    //   }
}