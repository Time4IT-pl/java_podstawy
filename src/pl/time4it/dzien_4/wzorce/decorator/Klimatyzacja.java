package pl.time4it.dzien_4.wzorce.decorator;

public class Klimatyzacja extends Samochod {

    Samochod samochod;

    public Klimatyzacja(Samochod samochod) {
        this.samochod = samochod;
    }

    @Override
    public String about() {
        return samochod.about() + " z klimatyzacja";
    }

    @Override
    public double getCena() {
        return  samochod.getCena() + 5000.0;
    }
}
