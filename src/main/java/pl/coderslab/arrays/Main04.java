/*
W pliku `Main04.java`:

        1. stwórz tablicę o nazwie `numbers`
        zawierającą 10 dowolnych liczb,
        2. stwórz zmienną tablicową `reverse`
        i umieść w niej elementy tablicy `numbers`
        w odwrotnej kolejności,
        3. wypisz na konsoli elementy z tablicy `reverse`.
        Dla tablicy o elementach:
        ```
        3, 5, 7, 2, 1
        ```
        otrzymamy wynik:
        ```
        1, 2, 7, 5, 3
        ```
*/
package pl.coderslab.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main04 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
        System.out.println("===========================================");
        System.out.println("tablica przed " + Arrays.toString(numbers));
        System.out.println("===========================================");
        int[] reverse = new int[10];

        for (int i = numbers.length-1; i >=0; i--) {
            //reverse[i] = numbers[numbers.length - 1 -i];
            reverse[numbers.length - 1 -i] = numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("===========================================");

        for (int i = 0; i<=numbers.length - 1; i++ ) {
            reverse[i] = numbers[numbers.length - 1 - i];
            System.out.print(reverse[i] + " ");
        }
        System.out.println();
        System.out.println("===========================================");
        System.out.println(reverse[numbers.length - 1]);
        System.out.println("===========================================");
        System.out.println("tablica po " + Arrays.toString(reverse));


        System.out.println("===========================================");
        System.out.println("tabRandom1");
        Random random1 = new Random();
        int[] tabRandom1 = new int[10];
        for (int i = 0; i < tabRandom1.length; i++) {
            tabRandom1[i] = random1.nextInt(15);
            System.out.print(tabRandom1[i] + " ");
        }
        System.out.println();
        System.out.println("===========================================");
        int[] tabRandom1Clone = new int[tabRandom1.length];
        System.out.println(Arrays.toString(tabRandom1Clone));
        System.out.println("===========================================");
        tabRandom1Clone = tabRandom1.clone();
        System.out.println(Arrays.toString(tabRandom1.clone()));
        System.out.println("===========================================");
        System.out.println("Arrays.toString dla  tanRandoo");
        for (int i = 0; i < tabRandom1.length; i++) {
            tabRandom1Clone[i] = tabRandom1[tabRandom1.length-1 - i];
            System.out.print(tabRandom1Clone[i] + " ");
        }
        System.out.println();
        System.out.println("============================================");
        String [] a = new String[4];
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + 1 + " ");
        }
    }
}
