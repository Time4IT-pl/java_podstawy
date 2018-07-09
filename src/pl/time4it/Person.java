package pl.time4it;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private String email;

    //konstruktor bezargumentowy.
    // Generowany automatycznie przez kompilator.
    public Person() { }

    public Person(String name, String lastName, int age, String email){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " +
                lastName + " " +
                 age +
                " " +  email;
    }
}
