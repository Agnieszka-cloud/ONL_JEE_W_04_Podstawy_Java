package pl.coderslab.cutstrings;

import java.util.Arrays;

public class main4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(onlyTwoElements("Java-zadania-podzial-napisow", '-')));

    }

    public static String[] onlyTwoElements(String str, char separator) {
        //metoda przyjmuje String, nie char, dlatego musimy zmienić separator na Stringa
        return str.split(String.valueOf(separator), 2);
    }
}
