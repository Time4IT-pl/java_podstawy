package pl.time4it.dzien_1;

public class Main {

   static Person person = new Person(); //konstr bez arg.
   static Animal animal = new Animal();


   //metoda statyczna uruchamiajaca aplikację.
   public static void main(String[] args) {

      Creator creator = new Creator(); //tworzenie obiektu kreatora.

      //tworzenie obiektów Person i Animal  z klasy Creator.

      Person marek = creator.createPerson("Marek","Nowak",45, "marek@o2.pl");
      System.out.println(marek); //wyswetlenie person

      Animal reksio = creator.createAnimal("Reksio", 2);
      System.out.println(reksio); //wyswietlenie animal. bez owner

      Animal pluto = creator.createAnimal("Pluto", 4, marek);
      System.out.println(pluto); //wyswietlenie animal. z owner

      String p = person.toString();
      System.out.println(person);
      System.out.println(p);
      System.out.println("-----------------------------------"); //odstep

      Animal reks = creator.createAnimalWithoutContructor("Rex", 9, marek);
      System.out.println("Pies Marka " + reks.toString());
      reks.setOwner(creator.createPerson("Ania", "Bankowa", 39, "ania@wp.pl"));
      System.out.println("Zmiana wlascieciela na Anie " + reks);

      System.out.println("-----------------------------------");
      AnimalProgram.createNewAnimal(); //uruchomienie programu z klasy AnimalProgram


   }


}


