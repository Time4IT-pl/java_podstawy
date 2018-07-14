package pl.time4it.dzien_5.threads.przyklad_2;

public class Main {

    public static void main(String[] args) {
        Bucket bucket = new Bucket();

        Consument consument = new Consument("Konsument", bucket);
        Producer producer = new Producer("Producent", bucket);

        consument.start();
        producer.start();



    }



}
