/*
W pliku `Main03.java`:

        1. umieść metodę o sygnaturze
        `public static int countTokens(String str)`,
        2. uzupełnij ciało metody tak,
        aby zwracała liczbę wyrazów w podanym ciągu znaków.
        Metoda powinna pomijać białe znaki.
        Przykład:
        dla `String str = "   To jest  tekst do   ";` mamy otrzymać wartość **4**;
*/
        package pl.coderslab.cutstrings;

public class Main03 {

    public static void main(String[] args) {

        String str = "ala ma kota i nie tylko i nie tylko";
        System.out.println(countTokens(str));
    }
    public static int countTokens(String str){
        int amountOfTokens = 0;
        //String[] split = str.trim().split("\\W");
        String[]a = str.split(" ");
        for (int i = 0; i <a.length ; i++) {
            amountOfTokens = i;
        }
        amountOfTokens ++;
        return amountOfTokens;
    }
}
