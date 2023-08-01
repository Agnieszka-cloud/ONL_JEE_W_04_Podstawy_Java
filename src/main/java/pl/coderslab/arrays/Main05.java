/*
W pliku `Main05.java`:

        1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
        2. posortuj rosnąco tablicę wykorzystując metody klasy `Arrays`,
        3. wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy `Arrays`.
*/
package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main05 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.print(numbers[i]);
        }
        System.out.println(", Tablica " + Arrays.toString(numbers));
        System.out.println("===============================================");
        Arrays.sort(numbers);
        System.out.println("Tablica posortowana " + Arrays.toString(numbers));
        System.out.println("===============================================");

        int[] liczby = new int[10];
        Random random1 = new Random();
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt();
            System.out.print(liczby[i] + ",");
        }
        System.out.println();
        System.out.println("===============================================");
        Arrays.sort(liczby);
        System.out.println(Arrays.toString(liczby));
    }
}


