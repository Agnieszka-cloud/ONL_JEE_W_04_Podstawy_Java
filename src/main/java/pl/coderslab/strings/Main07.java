/*Palindrom to słowo lub zdanie, które brzmi tak samo zarówno czytane wspak,
jak i od początku, np.: "kajak", "radar", "Kobyła ma mały bok".

        W pliku `Main07.java` napisz program, który sprawdzi,
        czy (boolean true or false) zmienna `str`, umieszczona w klasie, jest palindromem.

        Uwaga: podczas sprawdzania palindromu zignoruj spacje.*/
package pl.coderslab.strings;

import java.util.Locale;

public class Main07 {

    public static void main(String[] args) {
        String str1 = "A to kanapa pana kota";
        System.out.println(check2(str1) ? "Tak" : "Nie");
        System.out.println(isPalindrom(str1) ? "Tak" : "Nie");
        String str2 = "A to kan nie palindrom apa pana kota";
        System.out.println(check2(str2) ? "Tak" : "Nie");
        System.out.println(isPalindrom(str2) ? "Tak" : "Nie");
        String str3 = "kajak";
        System.out.println(check2(str3) ? "Tak" : "Nie");
        System.out.println(isPalindrom(str3) ? "Tak" : "Nie");
        String str4 = "aa";
        System.out.println(check2(str4) ? "Tak" : "Nie");
        System.out.println(isPalindrom(str4) ? "Tak" : "Nie");
        String napis = "Kobyła ma mały bok";
        boolean czyPalindrom = true;
        String napisBezSpacjiIWielkichLiter = napis.toLowerCase().replaceAll(" ", "");
        System.out.println(napisBezSpacjiIWielkichLiter);
        System.out.println("=========================================================");
        for (int i = 0; i < napisBezSpacjiIWielkichLiter.length() / 2; i++) {
            if (napisBezSpacjiIWielkichLiter.charAt(i) !=
                    napisBezSpacjiIWielkichLiter.charAt(napisBezSpacjiIWielkichLiter.length() - 1 - i)) {
                czyPalindrom = false;
            }
        }
        System.out.println(czyPalindrom);
        System.out.println("=========================================================");


        String str = "A to kanapa pana kota";
        String withoutWhiteChars = str.replaceAll(" ","").toLowerCase();
        boolean isPalindrom = true;
        for (int i = 0; i < withoutWhiteChars.length() / 2 ; i++){
            if (withoutWhiteChars.charAt(i) != withoutWhiteChars.charAt(withoutWhiteChars.length() - 1 - i)){
                isPalindrom = false;
            }
        }
        System.out.println(isPalindrom);
        System.out.println("=========================================================");


        String palindrom = "Kobyła ma małyy BOK";
        String ciągMałychLiter = palindrom.replaceAll(" ","").toLowerCase();
        boolean jestPalindrom = true;
        for (int j = 0; j < ciągMałychLiter.length() / 2; j++) {
            if(ciągMałychLiter.charAt(j)!=ciągMałychLiter.charAt(ciągMałychLiter.length() - 1 - j)){
                jestPalindrom = false;
            }
        }
        System.out.println(jestPalindrom);
        System.out.println("=========================================================");


        String napisy = "abba";
        String napisyBiałe = napisy.toLowerCase().replaceAll(" ","");
        boolean czyJestPalindromem = true;
        for (int i = 0; i < napisyBiałe.length() / 2; i++) {
            if (napisyBiałe.charAt(i) != napisyBiałe.charAt(napisyBiałe.length() - 1 - i)) {
                czyJestPalindromem = false;
            }
        }
        System.out.println(czyJestPalindromem);
        System.out.println("=========================================================");
    }

    private static boolean check2(String str) {
        String noSpacesLowerCase = str.replace(" ", "").toLowerCase();
        return new StringBuilder(noSpacesLowerCase).reverse().toString().equals(noSpacesLowerCase);
    }

    //===============================================================

    public static  boolean isPalindrom (String str){
        String plain = str.toLowerCase().replaceAll(" ","");
        return new StringBuilder(plain).reverse().toString().equals(plain);
    }
}
