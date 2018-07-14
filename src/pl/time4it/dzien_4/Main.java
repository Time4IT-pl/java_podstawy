package pl.time4it.dzien_4;

import java.util.Random;

public class Main {

    static private long startTime;
    static private long stopTime;
    public static final double NANOS_PER_SEC = 1000000000.0;

    public static void main(String[] args) {


        Random random = new Random();
        int number = 0;

        start();
        for (int i = 0; i < 1000; i++) {
            number = random.nextInt();

        }
        stop();
        System.out.println(getTime());
        resetTime();

        start();
        for (int i = 0; i < 10000; i++) {
            number = random.nextInt();

        }
        stop();
        System.out.println(getTime());
        resetTime();

    }

    public static void start() {
        startTime = System.nanoTime();
    }

    public static void stop() {
        stopTime = System.nanoTime();
    }

    public static double getTime() {
        return (stopTime - startTime) ;
    }

    public static void resetTime(){
        stopTime = 0;
        startTime = 0;
    }




}
