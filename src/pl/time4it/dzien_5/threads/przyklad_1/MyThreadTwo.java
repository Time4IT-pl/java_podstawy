package pl.time4it.dzien_5.threads.przyklad_1;

public class MyThreadTwo implements Runnable{
    @Override
    public void run() {
        counting(500, "ThreadTwo");
    }

    public static void counting(int i, String threadname) {
        for (int j = 0; j < i; j++) {
            System.out.println("                 " + threadname + " " + j);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
