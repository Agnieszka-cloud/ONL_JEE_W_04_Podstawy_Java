/*W pliku `Main02.java`:

        1. przy użyciu pętli `for` stwórz tablicę
        o nazwie `randNumbers`, zawierającą 20 losowych liczb
        z zakresu `0-100` (do otrzymania losowej wartości użyj
        sposobu opisanego w snippetach),
        2. wypisz w konsoli minimalną wartość z tablicy.*/
package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        System.out.println("=============================================");
        Random random = new Random();

        int [] randNumbers = new int[20];
        System.out.println("elementy tablicy randNumbers:  ");
        for (int i = 0; i< randNumbers.length; i++){
            randNumbers[i] = random.nextInt(101);
            System.out.print(randNumbers[i] + ",");
        }
        System.out.println();
        System.out.println("=============================================");
        System.out.println("Cała tablica randNumbers Arrays.toString : " + Arrays.toString(randNumbers));
        System.out.println("=============================================");

        int min = randNumbers[0];
        for (int i:randNumbers) {
            if (i < min){
                System.out.println("mniejszy od pierwszej oraz od kolejnej mniejszej: " + (min = i));
            }
        }
        System.out.println("=============================================");
        System.out.println("int min - losowa minimalna:  " + min);
        System.out.println("=============================================");

        System.out.println("int min1 = Integer.MAX_VALUE; :");
        int min1 = Integer.MAX_VALUE;
        System.out.println(min1);
        System.out.println("=============================================");
        for (int i = 0; i< randNumbers.length; i++){
            if (randNumbers[i] < min1){
                min1 = randNumbers[i];
                System.out.println("mniejsze od MAX_VALUE: " + Integer.toString(min1) + ", ");
            }
        }
        System.out.println("======================================");
        System.out.println("int min1 - losowa minimalna:  " + min1);
        System.out.println("======================================");

        Random random1 = new Random();
        int[] tabRandom1 = new int[10];
        System.out.println("elementy tabRandom1:  ");
        for (int i = 0; i < tabRandom1.length; i++) {
            tabRandom1[i] = random1.nextInt(50);
            System.out.print(tabRandom1[i] + " ");
        }
        int minRandom1 = tabRandom1[0];
        for (int i :tabRandom1) {
            if (i < minRandom1){
                minRandom1 = i;
            }
        }
        System.out.println();
        System.out.println("minimalna wartość na indeksie w tablicy tabRandom1 :  " + minRandom1);
        System.out.println("======================================");

        Random random2 = new Random();
        int[] tabRandom2 = new int[5];
        int minimal = Integer.MAX_VALUE;
        System.out.println("elementy tabRandom2:  ");
        for (int i:tabRandom2
        ) {tabRandom2[i] = random2.nextInt(3);
            System.out.print(tabRandom2[i] + ",");
            if (tabRandom2[i] < minimal){
                minimal = tabRandom2[i];
            }
        }
        System.out.println();
        System.out.println("minimal w tanRandom2:  " + minimal);

    }
}
