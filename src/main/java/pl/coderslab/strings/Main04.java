/*
W pliku `Main04.java` została umieszczona metoda o sygnaturze:

        `public static boolean containsStr(String str, String search)`.

        Uzupełnij ciało metody tak, aby zwracała informację czy

        zmienna `str` zawiera w sobie element napisu ze zmiennej `search`.

*/

package pl.coderslab.strings;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {
        System.out.println("metoda containsSearch: " + containsSearch("kocham Przemka", "drze"));
        System.out.println("metoda containsZaPomocąSplit: " + containsZaPomocąSplit("kocham gvyb hbhnoi Przemka", "siB;ie ygoyougyu gyyiy Przemka"));
        System.out.println("metoda contains: " + contains("kocham Przemka", "kocham"));
        System.out.println("metoda contain: " + contain("kocham Przemka", "drze"));

        System.out.println("działa?: taaaak!!! " + "metoda contains: " + contains("kocham", "kociak"));

        System.out.println("============================================");
        char razem[][] = {{'k', 'o', 'c', 'h', 'a', 'm'}, {'k', 'o', 'c'}};
        System.out.print("tablica razem: ");
        for (int i = 0; i < razem.length; i++) {
            for (int j = 0; j < razem[i].length; j++) {
                System.out.print(razem[i][j]);
            }
        }
        System.out.println();
        System.out.print("============================================");
    }

    static boolean containsSearch(String str, String search) {
        return str.contains(search);
    }

    public static String containsZaPomocąSplit(String str, String search) {
        // czy słowo zawiera się w ciągu innych słów, nie może być fragment słowa
        String[] splitStr = str.split(" ");
        String[] splitSearch = search.split(" ");
        String incommon = "";
        for (int i = 0; i < splitStr.length; i++) {
            if(splitStr[i].equals(splitSearch[i])){
                incommon =  incommon + splitSearch[i];
            }
        }
        return incommon;
    }

    static boolean contains(String str, String search) {
        boolean yes = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < search.length(); j++) {
                if (str.charAt(i) == search.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean contain(String str, String search) {
        boolean contains = false;
        char[] tablicaStr = str.toCharArray();
        char[] tablicaSearch = search.toCharArray();
        for (int i = 0; i < tablicaStr.length; i++) {
            for (int j = 0; j < tablicaSearch.length; j++) {
                if (tablicaStr[i] == tablicaSearch[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
