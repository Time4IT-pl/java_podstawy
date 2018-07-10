package pl.time4it.dzien_2.string.zadania;

public class zadanie_1 {

    // Napisz metodę,
    // która dla danej tablicy liczb
    // całkowitych zwraca pierwszy element tablicy.

    public static void main(String[] args) {

    System.out.println(firstIndex(new int[] {1,2,3,4,5,6,7}));

    }

    public static int firstIndex(int[] numbers) {
        return numbers[0];
    }


}
