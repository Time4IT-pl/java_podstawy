package pl.time4it;


public class Animal {

    private String name;
    private int age;
    private Person owner;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Animal() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return name + " " +  age + " " + owner;
    }



}
