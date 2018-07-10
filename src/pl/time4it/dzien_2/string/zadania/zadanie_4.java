package pl.time4it.dzien_2.string.zadania;

public class zadanie_4 {


    public static void main(String[] args) {
        int[] tab = {8,54,76,13,-9,12,45,789,-87};
        bubble_sort(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int[] bubble_sort(int[] tab) {

        int temp;
        int zm = 1;


        while( zm > 0) {
            zm = 0;

            for (int i = 0; i < tab.length -1; i++) {

                if( tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i +1] = tab[1];
                    tab[i] = temp;
                    zm++;
                }
            }
        }

        return tab;
    }
}
