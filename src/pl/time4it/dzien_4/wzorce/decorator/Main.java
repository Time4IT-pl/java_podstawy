package pl.time4it.dzien_4.wzorce.decorator;

public class Main {

    public static void main(String[] args) {
        Samochod mercedes = new Mercedes();
        Samochod audi = new Audi();

        System.out.println();
        System.out.println(mercedes.about() + " " + mercedes.getCena());
        System.out.println(audi.about() + " " + audi.getCena());

        mercedes = new OponyZimowe(mercedes);
        audi = new OponyZimowe(audi);

        System.out.println();
        System.out.println(mercedes.about() + " " + mercedes.getCena());
        System.out.println(audi.about() + " " + audi.getCena());

        System.out.println();
        mercedes = new Klimatyzacja(mercedes);
        System.out.println(mercedes.about() + " " + mercedes.getCena());


    }
}
