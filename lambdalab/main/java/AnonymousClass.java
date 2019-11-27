import java.util.List;

public class AnonymousClass {
    List<Person> personList = Person.createRoster();

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    public void createClass1() {
        CheckPerson tester1 = new CheckPerson() {
            @Override
            public Boolean test(Person p) {
                return p.getAge() < 19;
            }
        };
        System.out.println("Persons younger that 19 years:");
        printPersons(personList, tester1);

    }

    public void createClass2() {
        CheckPerson tester2 = new CheckPerson() {
            @Override
            public Boolean test(Person p) {
                return p.getAge() > 20;
            }
        };
        System.out.println("Persons older than 20 years:");
        printPersons(personList, tester2);

    }

    public static void main(String[] args) {
        AnonymousClass an = new AnonymousClass();
        an.createClass1();
        an.createClass2();

    }
}
