package pl.time4it.dzien_2.string.zadania;

public class zadanie_3 {

    //stworz metode laczącą dwie tablice.

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8};
        int[] m = {1,2,3,4,5,6,7,8};
        int[] a = sumTables(n,m);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] sumTables(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];

      //  int counter = 0;
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
          //  counter++;
        }

        for(int j = a.length ; j < temp.length; j++) {
            temp[j] = b[j - a.length];
        }
        return temp;
    }
}
