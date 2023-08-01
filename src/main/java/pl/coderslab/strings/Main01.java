/*
W pliku `Main01.java` napisz program, który:

        1. pobierze przedostatnią literę zmiennej `str`,
        znajdującej się w pliku,
        2. wyświetli na konsoli liczbę wystąpień tej litery
        w całym ciągu znaków. ( ciąg znaków czyli String )
*/
package pl.coderslab.strings;

import java.util.Arrays;
import java.util.Locale;

public class Main01 {

    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        String strr = str.substring(str.length() - 2,str.length()-1);
        // a czyli przedostatnia
        System.out.println(strr);
        int zsumujIlość = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( str.substring(i,i + 1).equals(strr)) {
                zsumujIlość ++;
            }
        }
        System.out.println(zsumujIlość);

        System.out.println("====================================================");
        int i = 0; // każdy index
        char each = str.charAt(i);
        char first = str.charAt(0);
        char eight = str.charAt(7);
        System.out.println(first == 'C'); // true
        System.out.println(eight == 'a'); // true
        System.out.println(str.length()); // 39
        System.out.println(); //

        System.out.println("====================================================");
        char [] tablicaLiter = str.toCharArray();
        System.out.println(tablicaLiter); // CodersLab jak dobrze zacząć programować
        System.out.println(Arrays.toString(tablicaLiter)); //[C, o, d, e, r, s, L, a, b,
        //  , j, a, k,  , d, o, b, r, z, e,  , z, a, c, z, ą, ć,  , p, r, o, g, r, a, m, o, w, a, ć]
        int  przedostatniINDEX = str.length() - 2; // 37
        System.out.println(przedostatniINDEX); // 37
        int ilośćWystąpień = 0;
        char przedostatniaLITERA = str.charAt(str.length()- 2);
        System.out.println(przedostatniaLITERA);
        for (int j = 0; j < tablicaLiter.length; j++) {
            if (tablicaLiter[j] == przedostatniaLITERA) {
                ilośćWystąpień ++;
            }
        }
        System.out.println(ilośćWystąpień);

        System.out.println("=====================================================");
        char penultimate1 = str.charAt(str.length() - 2);
        System.out.println(penultimate1);// a
        int amountOfChars = 0;
        for (int ii = 0; ii < str.length(); ii++) {
            System.out.print(str.charAt(ii)); // CodersLab jak dobrze zacząć programować
            if (str.charAt(ii) == str.charAt(str.length() - 2)) {
                amountOfChars++;
            }
        }
        System.out.println();//
        System.out.println(amountOfChars); // 5

        System.out.println("====================================================+");
        char penultimate11 = str.charAt(str.length() - 2);
        System.out.println(penultimate1);// a
        int iloscWystapienMalegoA = 0;
        // iii to przejście indeksu przez każdy element str bo ma sie odnieść do długości str
        for (int iii = 0; iii < str.length(); iii++) {
            if (str.charAt(iii) == penultimate11) {
                iloscWystapienMalegoA++;
            }
        }
        System.out.println(iloscWystapienMalegoA); // 5
        System.out.println("Litera: " + penultimate1 + " wystąpiła "
                + iloscWystapienMalegoA + " razy"); // Litera: a wystąpiła 5 razy

        System.out.println("=====================================================");
        char lastBeforelastLetter = str.charAt(str.length() - 2);
        System.out.println(lastBeforelastLetter); // a
        int quantityOflastBeforelastLetter = 0;
        char siódmy = str.charAt(6);
        System.out.println(siódmy); // L
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == lastBeforelastLetter) {
                quantityOflastBeforelastLetter++;
            }
        }
        System.out.println("Litera a wystąpiła w str: " + quantityOflastBeforelastLetter + " razy"); // Litera a wystąpiła w str: 5 razy

        System.out.println("=====================================================");
        char litera = str.charAt(str.length() - 2);
        System.out.println(litera); // a
        int sumOfletters = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == litera) {
                sumOfletters++;
            }
        }
        System.out.println(sumOfletters); // 5

        System.out.println("======================================================");
        char przedostatnia = str.charAt(str.length() - 2);
        System.out.println(przedostatnia); // a
        int ilośćWystąpieńPrzedostatniej = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == przedostatnia) {
                ilośćWystąpieńPrzedostatniej++;
            }
        }
        System.out.println(ilośćWystąpieńPrzedostatniej); // 5

        System.out.println("========================================================");
        String example = "Przuroda regeneruje moją duszę";
        char oneBeforeTheLast = example.charAt(example.length() - 2);
        int amountOfOneBeforeTheLast = 0;
        System.out.println("OTO ONA: " + oneBeforeTheLast); // OTO ONA: z
        for (int j = 0; j < example.length(); j++) {
            if (example.toLowerCase().charAt(j) == oneBeforeTheLast) {
                amountOfOneBeforeTheLast++;
            }
        }
        System.out.println("Ile jest wystąpień " + oneBeforeTheLast + " w zdaniu: " + example + "? "
                + amountOfOneBeforeTheLast); // Ile jest wystąpień z w zdaniu: Ziemia regeneruje moją duszę? 2

        System.out.println("=========================================================");
    }
}
