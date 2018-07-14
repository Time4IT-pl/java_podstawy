package pl.time4it.dzien_4.wzorce.decorator;

public abstract class Samochod {



    protected String samochod = "Samochod osobowy: ";


    public  String about() {
        return samochod;
    }

    public abstract double getCena();




}
