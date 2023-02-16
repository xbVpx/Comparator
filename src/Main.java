import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        PersonSurnameLengthComparator personComporator = new PersonSurnameLengthComparator();
        person.add(new Person("Иванов", "Иван", 17));
        person.add(new Person("Игнатьев", "Игорь", 23));
        person.add(new Person("Потрясов", "Антон", 38));
        person.add(new Person("Ануфреев", "Олег", 13));
        Collections.sort(person, personComporator);

        System.out.println(person);
    }
}