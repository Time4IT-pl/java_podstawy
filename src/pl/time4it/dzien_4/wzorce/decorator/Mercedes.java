package pl.time4it.dzien_4.wzorce.decorator;

public class Mercedes extends Samochod{

    public Mercedes() {
        samochod = "Meredes";
    }

    @Override
    public double getCena() {
        return 124000;
    }
}
