package pl.time4it.dzien_4.wzorce.decorator;

public class OponyZimowe extends Decorator{

    Samochod samochod;

    public OponyZimowe(Samochod samochod) {
        this.samochod = samochod;
    }

    @Override
    public String about() {
        return samochod.about() + " z oponami zimowymi";
    }

    @Override
    public double getCena() {
        return samochod.getCena() + 2300;
    }
}
