import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    private List<Person> roster;

    @Before
    public void setUp() throws Exception {
        Person p1 = new Person("Abby J", LocalDate.of(2000, 11, 22), Person.Sex.FEMALE, "abbyj@gmail.com");
        Person p2 = new Person("Bobby A", LocalDate.of(2010, 5, 20), Person.Sex.MALE, "bobbya@gmail.com");
        Person p3 = new Person("Grace M", LocalDate.of(1997, 3, 6), Person.Sex.FEMALE, "gracem@gmail.com");
        Person p4 = new Person("Henry P", LocalDate.of(1995, 1, 10), Person.Sex.MALE, "henryp@gmail.com");
        Person p5 = new Person("Chris H", LocalDate.of(2005, 10, 1), Person.Sex.MALE, "chrish@gmail.com");
        this.roster = new ArrayList<>();
        roster.add(p1);
        roster.add(p2);
        roster.add(p3);
        roster.add(p4);
        roster.add(p5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        String expected = "Abby J";
        String actual = this.roster.get(0).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        String expected = "AbbyNew J";
        this.roster.get(0).setName(expected);
        Assert.assertEquals(expected, this.roster.get(0).getName());
    }

    @Test
    public void getBirthday() {
        LocalDate expectedBirthday = LocalDate.of(2000, 11, 22);
        LocalDate actualBirthday = this.roster.get(0).getBirthday();
        Assert.assertEquals(expectedBirthday, actualBirthday);
    }

    @Test
    public void setBirthday() {
        LocalDate expectedBirthday = LocalDate.of(1998, 7, 7);
        this.roster.get(0).setBirthday(expectedBirthday);
        LocalDate actualBirthday = this.roster.get(0).getBirthday();
        Assert.assertEquals(expectedBirthday, actualBirthday);
    }

    @Test
    public void getGender() {
        Person.Sex expected = Person.Sex.FEMALE;
        Person.Sex actual = this.roster.get(0).getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGender() {
        Person.Sex expected = Person.Sex.FEMALE;
        this.roster.get(0).setGender(expected);
        Person.Sex actual = this.roster.get(0).getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmailAddress() {
        String expected = "abbyj@gmail.com";
        String actual = this.roster.get(0).getEmailAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmailAddress() {
        String expected = "abbyjnew@gmail.com";
        this.roster.get(0).setEmailAddress(expected);
        String actual = this.roster.get(0).getEmailAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        int expected = 19;
        int actual = this.roster.get(0).getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPerson() {
        Person p = new Person("Jeanne", LocalDate.now(), Person.Sex.FEMALE, "jeanne@gmail.com");
        p.printPerson();
        String expected = "Person{" +
                "name='" + p.getName() + '\'' +
                ", birthday=" + p.getBirthday() +
                ", gender=" + p.getGender() +
                ", emailAddress='" + p.getEmailAddress() + '\'' +
                '}';

    }
}
