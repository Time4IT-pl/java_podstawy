package pl.time4it.dzien_1;

public class Creator {

    private Animal animal;

    public Person createPerson(String name, String lastName, int age, String email) {
        Person person  = new Person(name, lastName, age, email);
        return person;
    }

    public static Animal createAnimal(String name, int age){
        return new Animal(name, age);
    }

    public static Animal createAnimal(String name, int age, Person owner) {
        Animal animal = new Animal();

        return new Animal(name, age, owner);
    }

    //metoda korzysta z konstruktorwa bez arg. medota najbardziej odseparowana od logiki Animal.
    public Animal createAnimalWithoutContructor(String name, int age, Person owner) {
        animal = new Animal();
        animal.setName(name);
        animal.setAge(age);
        animal.setOwner(owner);
        return animal;
    }



}
