import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    private static List<Person> people = new ArrayList<>();
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Dee");
        person1.setNumber("1234");
        person2.setName("Emma");
        person2.setNumber("3456");
        people.add(person1);
        people.add(person2);

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals("Emma")){
                System.out.println(people.get(i).getNumber());
            }

        }

    }
}
