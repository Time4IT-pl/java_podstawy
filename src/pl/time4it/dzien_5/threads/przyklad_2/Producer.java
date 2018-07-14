package pl.time4it.dzien_5.threads.przyklad_2;

public class Producer extends Thread {

    private long id = 1;
    private Bucket bucket;
    private String name;

    private int counter = 0;

    public Producer(String name, Bucket bucket) {
        this.name = name;
        this.bucket = bucket;
        this.counter = 1;
    }


 //   @Override
    public void run() {

        while(!isInterrupted()) {
            System.out.println(name + " wytworzył produkt: " + counter);

            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (bucket) {
                bucket.notifyAll();
                bucket.setProduct(makingProduct());
                try {

                    bucket.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }


    }


    public long makingProduct() {
        return counter++;
    }

}
