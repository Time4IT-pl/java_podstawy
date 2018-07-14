package pl.time4it.dzien_5.threads.przyklad_2;

public class Consument extends Thread {

    private Bucket bucket;
    private String name;

    public Consument(String name, Bucket bucket) {
        this.name = name;
        this.bucket = bucket;
    }

    //   @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                synchronized (bucket) {
                    bucket.getProduct();
                    bucket.wait();
                    System.out.println(name
                            + " konsument kupuje produkt nr "
                            + bucket.getProduct());
                    this.sleep(1000);
                    bucket.notifyAll();

                }
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
