public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person(2, "Nikoloz", "Razmadze", 20, "BTU university");

        person.getUniversity();
        person.getFullName();

    }
}

class Person {
    int id;
    String firstName;
    String lastName;
    int age;
    String university;

    public Person(int id, String firstName, String lastName, int age, String university) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.university = university;
    }

    void getUniversity() {
        System.out.println("სასწავლებელი: " + university);
    }

    void getFullName() {
        System.out.println("სახელი გვარი: " + firstName + " " + lastName);
    }
}
