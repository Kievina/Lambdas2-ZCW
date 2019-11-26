package java;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class PersonTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getBirthday() {
    }

    @Test
    public void setBirthday() {
    }

    @Test
    public void getGender() {
    }

    @Test
    public void setGender() {
    }

    @Test
    public void getEmailAddress() {
    }

    @Test
    public void setEmailAddress() {
    }

    @Test
    public void getAge() {
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
