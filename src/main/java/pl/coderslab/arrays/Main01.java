/*W pliku `Main01.java`:

        1. stwórz 50-elementową tablicę o nazwie `mainTab` z kolejnymi
        liczbami całkowitymi od 0 do 49,
        2. wypisz na konsoli po kolei elementy tej tablicy, po dziesięć w każdym wierszu,
        3. liczby jednocyfrowe uzupełnij dodatkowym zerem na początku (np. 00,01).
        ```
        00, 01, 02, 03, 04, 05, 06, 07, 08, 09,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
        30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
        40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
        ```*/
package pl.coderslab.arrays;

import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {
        int mainTab[] = new int[50];
        System.out.println("mainTab[50]: ");
        for (int number:mainTab
        ) {
            System.out.print(number);
        }
        System.out.println();
        System.out.println("===================================================");

        System.out.println("mainTab.length:  " + mainTab.length);
        System.out.println("===================================================");

        System.out.println("mainTab for i od 1:");
        for(int i = 1; i < mainTab.length; i++){
            mainTab[i] = i;
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("===================================================");
        // mainTab[0] = 0; nie wyświetli
        // bo i zaczyna pobierać index i  dodawać 1
        // od indeksu nr 1 a nie nr 0
        mainTab[1] = 1;
        mainTab[2] = 2;
        mainTab[49]= 49;
        int[] tabZ51Elementem = new int[mainTab.length + 1];
        System.out.println("tabZ51Elementem.length:  " + tabZ51Elementem.length);
        System.out.println("===================================================");

        tabZ51Elementem[50] = 50;
        System.out.println("Arrays.toString(tabZ51Elementem): ");
        System.out.println(Arrays.toString(tabZ51Elementem));
        System.out.println("===================================================");

        System.out.println("for i dla tabZ51Elementem zaczynając od index = 1:" );
        System.out.println();
        for(int i = 1; i< tabZ51Elementem.length; i++) {
            tabZ51Elementem[i] = i;
            if (i < 10) {
                System.out.print("0" + i + " ");
            }else {
                System.out.print(i + " ");
            }
//            if (i % 10 == 0) {
//                System.out.println();
//            }
            if (i % 5 == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("===================================================");

        int mainTab1[] =
                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,
                        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                        20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                        30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
                        40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
        System.out.println("mainTab1 foreach od 0:");
        for (int oneNumber : mainTab1) {
            System.out.print(oneNumber + ",");
        }
        System.out.println();

        System.out.println("===================================================");
        System.out.println("mainTab1 for i od 0:");
        for (int i = 0; i < mainTab1.length; i++) {
            System.out.print(mainTab1[i]);
        }
        System.out.println();
        System.out.println("===================================================");

        System.out.println("mainTab1 for i (String.format(\"%02d,\", mainTab[i]) ORAZ (i + 1)%10 == 0; System.out.println();");
        System.out.println();
        for (int i = 0; i < mainTab1.length; i++) {
            System.out.print(String.format("%02d,", mainTab1[i]));
            // %02d wykonuje konwersję dziesiętnych liczb całkowitych d,
            // sformatowanych z dopełnieniem zerowym ( 0 flaga ) o szerokości 2.
            // W ten sposób int argument,
            // którego wartość to np. 7, zostanie sformatowany "07"jako String.
            mainTab[0] = 0;
            mainTab[1] = 1;
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("=====================================");

        System.out.println("mainTab2 counter++ // prostopadła pętla dodająca przejścia pętli dla mianTab2, za pomocą zmiennej counter:");

        System.out.println();
        int [] mainTab2 = new int[50];
        int counter = 0; // prostopadła pętla dodająca przejścia pętli dla mianTab2
        for(int i = 0; i < mainTab2.length; i++) {
            mainTab2[i] = i;
            if (mainTab2[i] < 10) {
                System.out.print("0" + mainTab2[i] + ",");
            } else System.out.print(mainTab2[i] + ",");
            counter++; // prostopadła pętla dodająca przejścia pętli dla mianTab2
            if (counter == 10) {
                System.out.println();
                counter = 0; // prostopadła pętla dodająca przejścia pętli dla mianTab2
            }
        }
        System.out.println("=====================================");

        System.out.println("for i dla mainTab2 mój sposób:");
        System.out.println();
        for (int i = 0; i < mainTab2.length; i++) {
            mainTab2[i] = i;
            if (i < 10 ) {
                System.out.print("0" + i + " ");
            } else   {
                System.out.print(mainTab2[i] + " ");
            }
            if ((i + 1)% 10 == 0 ) {
                System.out.println();
            }
            if ( i == 9){
                System.out.println();
            }
            if ( i == 19){
                System.out.println();
            }
            if ( i == 29){
                System.out.println();
            }
            if ( i == 39){
                System.out.println();
            }
        }
    }
}
