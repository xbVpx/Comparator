public class Person {
    private String surname;
    private String name;
    private int age;

    public Person(String surname, String name, int age) {

        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return '\n' + "Фамилия " + surname +
                " имя " + name +
                " возраст " + age;
    }
}
