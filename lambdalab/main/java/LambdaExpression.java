
import java.util.List;

public class LambdaExpression {

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList1 = Person.createRoster();

        CheckPerson tester1 = p -> p.getAge() > 20;
        System.out.println("Persons who are older than 20 years:");
        printPersons(personList1, tester1);

        CheckPerson tester2 = p -> p.getAge() < 19;
        System.out.println("Persons who are younger than 19 years:");
        printPersons(personList1, tester2);
    }
}
