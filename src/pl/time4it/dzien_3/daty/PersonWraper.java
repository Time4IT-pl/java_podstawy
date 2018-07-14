package pl.time4it.dzien_3.daty;

import pl.time4it.dzien_3.kolekcje.Person;

import java.util.Date;

public class PersonWraper extends Person {
    Date date;

    public PersonWraper(String name, String email, int age) {
        super.setName(name);
        super.setEmail(email);
        super.setAge(age);
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PersonWraper{" +
                "date=" + date +
                "} " + super.toString();
    }
}
