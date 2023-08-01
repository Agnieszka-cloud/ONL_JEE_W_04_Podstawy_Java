/*W pliku `Main04.java` umieść metodę o sygnaturze:

        `public static String[] onlyTwoElements(String str, char separator)`.

        Uzupełnij ciało metody tak, aby zwracała tablicę dwóch elementów,
        które powstały po podzieleniu tekstu (`str`) po pierwszym napotkanym
        znaku podziału (`separator`).
        Przykład dla napisu `Java-zadania-podzial-napisow`
        oraz separatora `-` otrzymamy:
        1. pierwszy element tablicy: `Java`
        2. drugi element: `zadania-podzial-napisow`.*/
        package pl.coderslab.cutstrings;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {

        String str = "Java-zadania-podział-napisów";
        char separator = '-';
        System.out.println(Arrays.toString(onlyTwoElements(str,separator)));
    }
    public static String[] onlyTwoElements(String str, char separator){
        String[]a = str.split(String.valueOf(separator),4);
        return a;
    }
}
