package pl.time4it.dzien_5.threads.przyklad_1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new MyThreadOne());
        Thread threadTwo = new Thread(new MyThreadTwo());

        threadOne.start(); //startujemy pierwszy watek


        threadOne.join(2000);

        threadTwo.start();

        threadOne.join();


    }


}
