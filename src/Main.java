import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Иванов", "Иван", 17));
        persons.add(new Person("Игнатьев", "Игорь", 23));
        persons.add(new Person("Потрясов", "Антон", 38));
        persons.add(new Person("Ануфреев", "Олег", 13));

        Comparator<Person> comparator = (o1, o2) -> {
            int lengt1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int lengt2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            if (lengt1 != lengt2) {
                return Integer.compare(lengt2, lengt1);
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        };

        Predicate<Person> del = person-> person.getAge() < 18;
        persons.removeIf(del);


        Collections.sort(persons, comparator);
        System.out.println(persons);
    }
}