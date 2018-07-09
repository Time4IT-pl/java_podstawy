package pl.time4it;

import java.util.Scanner;

public class AnimalProgram {

    static Scanner scanner = new Scanner(System.in);
    static Creator creator = new Creator();
    static Person person = new Person();

    public static void createNewAnimal() {
        System.out.println("Podaj dane psa: ");
        System.out.println("wpisz imie: ");
        String name = scanner.next();
        System.out.println("podaj wiek: ");
        int age = scanner.nextInt();
        System.out.println("czy chcesz dodac wlasciciela?: ");
        System.out.println("t/n");
        String result = scanner.next();

        if(result.equals("t")) {
            System.out.println("podaj imie wlasciciela: ");
            //todo - dokonczyc implementacje.
            person.setName(scanner.next());
            System.out.println("podaj nazwisko: ");
            person.setLastName(scanner.next());
            System.out.println("podaj wiek: ");
            person.setAge(scanner.nextInt());
            System.out.println("podaj email");
            person.setEmail(scanner.next());

            Animal animal = creator.createAnimal(name, age, person);
            System.out.println(animal);

        } else if(result.equals("n")) {
            //todo - dokonczyc implementacje.
            System.out.println("koniec");
        } else {
            System.out.println("program koniec");
            System.out.println(
                    "dodales zwierzę: " + "imie: " + name + " wiek " + age);
        }

        System.out.println("podsumowanie: " + name + " " + age + " ");

        scanner.close();
    }
}
