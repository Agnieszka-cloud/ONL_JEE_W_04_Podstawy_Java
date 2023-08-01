/*
W pliku `Main03.java` została umieszczona metoda o sygnaturze:

        `public static String firstHalf(String str)`.

        Uzupełnij ciało metody tak, aby zwracała połowę napisu
        (uwzględniamy tylko część całkowitą podziału).
        Przykład: dla napisu `CodersLab` zwróci `Coder`.
*/

package pl.coderslab.strings;

import java.sql.PreparedStatement;

public class Main03 {
    public static void main(String[] args) {
        System.out.println(firstHalfCharAt("Tablica   Characters"));
        System.out.println(firstHalf("Kocham"));
        System.out.println(half("Coderslab"));
        System.out.println(zaPomocąSubstring("radar"));
    }
    public static String firstHalfCharAt(String str){
        String half = "";
        for (int i = 0; i< str.length() / 2 ; i++){
            half = half + str.charAt(i);
        }
        return half;
    }
    public static String firstHalf (String str) {
        String half = "";
        for(int i = 0; i < str.length() / 2; i++ ) {
            half = half + str.charAt(i);
        }
        return half;
    }
    public static String half (String str){
        String połowa = "";
        for ( int i = 0; i<=str.length() / 2; i++){
            połowa = połowa + str.charAt(i);
        }
        return połowa;
    }
    public static String zaPomocąSubstring (String str){
        int half = str.length() / 2;
        return str.substring(0,half);
    }
}

