package pl.time4it.dzien_2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {




    public static void main(String[] args) {

        List<String> lists =
                new ArrayList<>(Arrays.asList("Lukasz", "Bartek"));

        for (String s : lists ) {
            System.out.println(s);
        }

        List randomList = new ArrayList();
        int number = 10;
        String name = "Mariola";

        randomList.add(number);
        randomList.add(name);

        for (Object o: randomList) {
            System.out.println(o);

        }




    }


}
