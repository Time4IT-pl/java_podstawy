package pl.time4it.dzien_2.string;

public class Main {

    public static void main(String[] args) {

        int number = 10;

        String word = new String("");
        String word2 = "przykladowe slowo. drugie przykladowe slowo";

        int wordLenth = word2.length();
        System.out.println(wordLenth);

        char c = word2.charAt(1);
        System.out.println(c);


        String[] tabS =
                word2.split("\\.");
        System.out.println(tabS[0]);
        System.out.println(tabS[1]);

        String upper = word2.toUpperCase();
        System.out.println(upper);

        String numberToString = String.valueOf(number);

        String wordWithoudTrim = word2.trim();
        System.out.println(wordWithoudTrim);

        String subString = word2.substring(1, 5);
        System.out.println(subString);

        StringBuilder sbl = new StringBuilder();
        StringBuffer sb = null;

        String name = "name";
        String text = "nazwisko";
        String suma = name + text;


       // sbl.append(name).append(text).append("......");

        sbl.append(text).reverse();
        System.out.println(sbl);


        System.out.println(reverseString("Lukasz"));

    }

    public static String reverseString(String s) {
        char[] tab = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = tab.length; i > 0; i--) {
            sb.append(tab[i -1]);
        }
        return sb.toString();
    }
}
