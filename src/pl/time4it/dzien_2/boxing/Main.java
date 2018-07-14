package pl.time4it.dzien_2.boxing;

public class Main {


    public static void main(String[] args) {

        int number = 10;


        //stworzenie obiektu Integer niejawnie.
        //To jest autoboxing.
        Integer numberInt = 10;

        //stworzenie obiektu jawnie. Kompilator robi to za nas.
        Integer numberInt2 = new Integer(10);


        byte b = numberInt.byteValue();
        System.out.println(b);

        boolean f = numberInt.equals(numberInt2);
        System.out.println(f);

        String s = numberInt.toString();
        System.out.println(s);
        System.out.println("to jest liczba: " + numberInt);



    }
}
