import java.util.List;

public class SearchCriteriaLocal {
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    static class PersonsUnder19 implements CheckPerson {
        @Override
        public Boolean test(Person p) {
            return p.getAge() < 19;
        }
    }

    static class PersonsOver20 implements CheckPerson {
        @Override
        public Boolean test(Person p) {
            return p.getAge() > 20;
        }
    }

    public static void main(String[] args) {
//SearchCriteriaLocal localClassSearch = new SearchCriteriaLocal();
List<Person> personList = Person.createRoster();
CheckPerson tester1 = new PersonsUnder19();
        System.out.println("All persons under 19 years old:");
printPersons(personList,tester1);

        CheckPerson tester2 = new PersonsOver20();
        System.out.println("All persons over 20 years old:");
        printPersons(personList,tester2);
    }
}
