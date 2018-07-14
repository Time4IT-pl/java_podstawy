package pl.time4it.dzien_4.wzorce.decorator;

public class Audi extends Samochod {

    public Audi() {
        samochod = "Audi";
    }

    @Override
    public double getCena() {
        return 110000;
    }
}
