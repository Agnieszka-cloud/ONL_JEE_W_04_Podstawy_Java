/*
W pliku `Main06.java`:

        1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
        2. stwórz drugą tablicę, nazwij ją `secondNumbers`,
        wypełnij 10 dowolnymi liczbami,
        3. stwórz trzecią tablicę zawierającą sumy elementów,
        które mają w tablicach pozycję o tym samym indeksie.

        Dla przykładowych tablic:
        ```java
        int[] numbers = {2, 3};
        int[] secondNumbers = {3, 4};
        ```
        wynikiem będzie tablica o elementach `5 i 7`.
*/
package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] secondNumbers = {2, 4};
        Random random = new Random();
        //int[] numbers = new int[ARRAYS_SIZE];
        int[] numbers1 = new int[10];
        int[] secondNumbers1 = new int[10];

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = random.nextInt(10);
            System.out.print(numbers1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers1));

        for (int i = 0; i < secondNumbers1.length; i++) {
            secondNumbers1[i] = random.nextInt(10);
            System.out.print(secondNumbers1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(secondNumbers1));
        int[] sumeOfArrays = new int[10];
        System.out.println();
        for (int i = 0; i < sumeOfArrays.length; i++) {
            sumeOfArrays[i] = numbers1[i] + secondNumbers1[i];
            System.out.print(sumeOfArrays[i] + ",");
        }
        System.out.println();
        System.out.println();
        //Arrays.toString(sumeOfArrays);
        System.out.print("tablica sumy : " + Arrays.toString(sumeOfArrays));
        System.out.println();
        System.out.println("==============================================");

        int[] liczby1 = new int[10];
        int[] liczby2 = new int[10];
        Random random1 = new Random();
        for (int i = 0; i < liczby1.length; i++) {
            liczby1[i] = random1.nextInt(10);
            System.out.print(liczby1[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < liczby2.length; j++) {
            liczby2[j] = random1.nextInt(10);

            System.out.print(liczby2[j] + " ");
        }
        System.out.println();
        int[]suma = new int[10];
        for (int k = 0; k < suma.length; k++) {
            suma[k] = liczby1[k] + liczby2[k];
            System.out.print(suma[k] + ",");
        }
    }
}
