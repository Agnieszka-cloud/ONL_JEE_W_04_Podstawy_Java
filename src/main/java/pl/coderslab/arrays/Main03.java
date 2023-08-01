/*W pliku `Main03.java`:

        1. stwórz 10-elementową tablicę
        wypełnioną pojedynczą wartością "2".
        Tablica powinna wyglądać następująco:
        ````
        [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
        ````
        2. zadanie wykonaj **bez użycia pętli `for`**.*/
package pl.coderslab.arrays;

import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = 2;
            System.out.print(array[i] + ",");
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println(Arrays.toString(array));
        System.out.println("=============================");

        Arrays.fill(array,2);
        System.out.println(Arrays.toString(array));
        System.out.println("=============================");

        int[] tab = new int[10];
        Arrays.fill(tab,2);
        System.out.println(Arrays.toString(tab));
        System.out.println("=============================");

        int[] tab1 = new int[5];
        System.out.println(Arrays.toString(tab1).replace('0','2'));
        System.out.println("=============================");
    }
}
