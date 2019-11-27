import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
//        this.roster = new ArrayList<>();
    }

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;
//    private ArrayList<Person> roster;

    public static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();
        Person p1 = new Person("Abby J", LocalDate.of(2000, 11, 22), Person.Sex.FEMALE, "abbyj@gmail.com");
        Person p2 = new Person("Bobby A", LocalDate.of(2010, 5, 20), Person.Sex.MALE, "bobbya@gmail.com");
        Person p3 = new Person("Grace M", LocalDate.of(1997, 3, 6), Person.Sex.FEMALE, "gracem@gmail.com");
        Person p4 = new Person("Henry P", LocalDate.of(1995, 1, 10), Person.Sex.MALE, "henryp@gmail.com");
        Person p5 = new Person("Chris H", LocalDate.of(2005, 10, 1), Person.Sex.MALE, "chrish@gmail.com");
        roster.add(p1);
        roster.add(p2);
        roster.add(p3);
        roster.add(p4);
        roster.add(p5);
        return roster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public void printPerson() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}');
    }

//    public static void printPersons(List<Person> roster, CheckPerson tester) {
//        for (Person p : roster) {
//            if (tester.test(p)) {
//                p.printPerson();
//            }
//        }
//    }
}


