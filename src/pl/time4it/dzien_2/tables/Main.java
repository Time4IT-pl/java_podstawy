package pl.time4it.dzien_2.tables;

public class Main {

    public static void main(String[] args) {

        //deklracja z wartosciami
        int[] tab = {1,2,3,4,5,6};

        int[][] tab4 = new int[10][5];
        int[][] tab5 = {{10,2,4,5,6},{5,1,3,5,7,8}};

        //deklracja wielkosci bez wartosci
        int[] tab2 = new int[10];

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
            System.out.println(tab[i] + 10);


        }
    }
}
