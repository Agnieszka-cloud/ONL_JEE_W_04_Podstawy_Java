/*
W pliku `Main08.java` została umieszczona metoda o sygnaturze:

        `public static String toggleChar(String str) `.

        Uzupełnij ciało metody tak, aby zamieniała
        duże litery na małe i odwrotnie,
        a następnie zwracała wynik.

        Przykład: dla napisu `TaK` wyświetli `tAk`.
*/
package pl.coderslab.strings;

import java.util.Locale;

public class Main08 {

    public static void main(String[] args) {
        String sample = "DUŻE małe";
        String przykład = "DUŻE małe";
        System.out.println("toggleChar: " + toggleChar(sample));
        System.out.println("zamień: " + zamień(przykład));
        System.out.println("doZamiany: " + doZamiany("DUŻE małe"));
        System.out.println("zamiana: " + zamiana("DUŻE małe"));
        System.out.println("zamieniamy: "+ zamieniamy("DUŻE małe"));
        System.out.println("toggleeChar: " + toggleeChar(sample));
    }



    static String toggleChar(String str) {
        String toggleStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // reprezentuje każdy element ciągu
            if (Character.isUpperCase(ch)) {
                toggleStr = toggleStr + Character.toLowerCase(ch);
            } else {
                toggleStr = toggleStr + Character.toUpperCase(ch);
            }
        }
        return toggleStr;
    }



    static String zamień(String str) {
        String zamienione = "";
        for (int s = 0; s < str.length(); s++) {
            char każdy = str.charAt(s);
            if (Character.isUpperCase(każdy)) {
                zamienione = zamienione + Character.toLowerCase(każdy);
            } else {
                zamienione = zamienione + Character.toUpperCase(każdy);
            }
        }
        return zamienione;
    }



    public static String doZamiany(String str) {
        String zamieniony = "";
        for (int i = 0; i < str.length(); i++) {
            char każdy = str.charAt(i);
            char spacja = ' ';
            if (Character.isUpperCase(każdy)) {
                zamieniony = zamieniony + Character.toLowerCase(każdy);
            }
            if (str.charAt(i) == spacja) {
                zamieniony = zamieniony + każdy;
            } else if (Character.isLowerCase(każdy)) {
                zamieniony = zamieniony + Character.toUpperCase(każdy);
            }
        }
        return zamieniony;
    }



    public static String zamiana(String str) {
        String przykład = "";
        for (int i = 0; i < str.length(); i++) {
            char każdy = str.charAt(i);
            char spacja = ' ';
            if (Character.isUpperCase(str.charAt(i))) {
                przykład = przykład + Character.toLowerCase(każdy);
            }
            if (str.charAt(i) == spacja) {
                przykład = przykład + każdy;
            } else if (Character.isLowerCase(str.charAt(i))) {
                przykład = przykład + Character.toUpperCase(każdy);
            }
        }
        return przykład;
    }

    // Charaker. str.charAt(i) for if +
    public static String zamieniamy(String str) {
        String zamienony = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            char space = ' ';
            if (Character.isUpperCase(each)) {
                zamienony = zamienony + Character.toLowerCase(each);
            }
            if (each == space) {
                zamienony = zamienony + each;
            } else if ( Character.isLowerCase(each)){
                zamienony = zamienony + Character.toUpperCase(each);
            }
        }
        return zamienony;
    }

    // Charakter. StringBuilder.append().toString for if
    static String toggleeChar(String str) {
        StringBuilder toggled = new StringBuilder(str.length());
        for (char letter : str.toCharArray()) {
            if(Character.isUpperCase(letter)) {
                letter = Character.toLowerCase(letter);
            } else if(Character.isLowerCase(letter)) {
                letter = Character.toUpperCase(letter);
            }
            toggled.append(letter);
        }
        return toggled.toString();
    }
}





