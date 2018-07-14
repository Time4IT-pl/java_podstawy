package pl.time4it.dzien_3.kolekcje;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<Person> people = loadExampleList();
        view(people);
        System.out.println();
        Collections.shuffle(people);
        view(people);

        System.out.println();
        Collections.reverse(people);
        view(people);

        System.out.println();
        Collections.sort(people);
        view(people);

        removePerson(people, 20);
        removePersonCol(people, new Person("Beata", "beata@o2.pl", 24));


        System.out.println(loadExampleList(loadExampleList()));
        loadExampleList(loadExampleList());

        Person p =getPersonbyId(loadExampleList(loadExampleList()), 3);
        System.out.println(p);


        System.out.println();
        System.out.println("SET");
        Set<Person> personSetList = exampleSetPersonList();
        System.out.println(personSetList);




    }


    public static List<Person> loadExampleList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Ania", "ania@o2.pl", 20));
        people.add(new Person("Beata", "beata@o2.pl", 24));
        people.add(new Person("Magda", "magda@o2.pl", 19));
        people.add(new Person("Monika", "monika@o2.pl", 31));
        people.add(new Person("Joanna", "asia@o2.pl", 35));
        people.add(new Person("Ola", "ola@o2.pl", 25));


        return people;
    }

    public static void view(Collection<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    public static void removePerson(List<Person> people, int age) {
        System.out.println("========== ==============");
        for (Iterator<Person> iter = people.iterator(); iter.hasNext(); ) {

            Person p = iter.next();

            if (p.getAge() < age) {
                iter.remove();
                System.out.println("osoba usunieta: " + p);
            }
        }
    }

    public static Collection<Person> removePersonCol(List<Person> people, Person person) {
        System.out.println("========== ==============");
        for (Iterator<Person> iter = people.iterator(); iter.hasNext(); ) {

            Person p = iter.next();

            if (p.equals(person)) {
                iter.remove();
                System.out.println("osoba usunieta: " + p);
            }
        }
        return people;
    }

    public static Map<Integer, Person> loadExampleList(List<Person> people) {
        Map<Integer, Person> peopleMap = new HashMap<>();


        int counter = 0;
        for (Person p : people) {
            counter++;
            peopleMap.put(counter, p);
        }


        return peopleMap;
    }

    public static void viewMap(Map<Integer, Person> personMap) {
        for (Map.Entry<Integer, Person> ip : personMap.entrySet()) {
            System.out.println("key: " + ip.getKey() + " " + "value: " + ip.getValue());
        }


    }

    public static Person getPersonbyId(Map<Integer, Person> personMap, int id) {
        for (Map.Entry<Integer, Person> ip : personMap.entrySet()) {
            System.out.println("key: " + ip.getKey() + " " + "value: " + ip.getValue());

            if (ip.getKey() == id) {
                return ip.getValue();
            }

        }

        return new Person();
    }

    public static  Set<Person> exampleSetPersonList() {

        Set<Person> people = new HashSet<>();

        people.add(new Person("Ania", "ania@o2.pl", 20));
        people.add(new Person("Beata", "beata@o2.pl", 24));
        people.add(new Person("Beata", "beata@o2.pl", 24));
        people.add(new Person("Beata", "beata@o2.pl", 24));
        people.add(new Person("Magda", "magda@o2.pl", 19));
        people.add(new Person("Monika", "monika@o2.pl", 31));
        people.add(new Person("Joanna", "asia@o2.pl", 35));
        people.add(new Person("Ola", "ola@o2.pl", 25));

        return people;

    }

}
