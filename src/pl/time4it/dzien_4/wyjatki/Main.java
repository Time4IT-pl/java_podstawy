package pl.time4it.dzien_4.wyjatki;

public class Main {


    public static void main(String[] args) {


        try {
            tableIter(7);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("zle");

        } catch (Exception e) {

        }


    }

    public static void tableIter(int num) {
        int[] tab = new int[5];
        int counter=  0;
        for (int i = 0; i < num; i++) {
            counter++;
            tab[i] = counter;
        }
       // throw new ArrayIndexOutOfBoundsException("zluy index");

    }


}
