/*
W pliku `Main06.java` napisz program,
        który dla znajdującej się w pliku zmiennej `str`
        wyświetli na konsoli odwrócony napis.

        Przykład: dla napisu `Tak` wyświetli `kaT`.
*/
package pl.coderslab.strings;

public class Main06 {
    public static void main(String[] args) {
        System.out.println(reverse("valueOf fOeulav gnirtS"));
        System.out.println("=====================================");
        char [] exmpl = {'a','n','y'};
        System.out.println(String.valueOf(exmpl));
        System.out.println("=====================================");
        int forExampl = 1;
        System.out.println(String.valueOf(forExampl));
        System.out.println("=====================================");


        String napis = "aga i ala";
        String napisOdwrócony = "";
        for (int i = napis.length() - 1; i >= 0; i--) {
            napisOdwrócony = napisOdwrócony + napis.charAt(i);
        }
        System.out.println(napisOdwrócony);

        System.out.println("=====================================");
        String str = "codersLabxyz";
        String strReversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strReversed = strReversed + str.charAt(i);
        }
        System.out.println(strReversed);

        System.out.println("=====================================");
        String sample = "maciej orłoś";
        String sampleOdKońca = "";
        for (int j = 0; j < sample.length(); j++) {
            sampleOdKońca = sample.charAt(j) + sampleOdKońca;
        }
        System.out.println(sampleOdKońca);

        System.out.println("======================================");
        String łączenie = "agnieszka";
        String konkatenacjaPoLewej = "";
        for (int i = 0; i < łączenie.length(); i++) {
            konkatenacjaPoLewej = łączenie.charAt(i) + konkatenacjaPoLewej; // element i stoi po lewej stronie
            // dlatego dodaje elementy od 0 do końca i stawie po lewej stroni, w rezultacie napis jest od końca
        }
        System.out.println(konkatenacjaPoLewej);

        System.out.println("=====================================");
        String st = "abcdefghijk";
        char strTablica1[] = st.toCharArray();
        char strTablicaOdwrócona1[] = new char[strTablica1.length]; // trzeba utworzyć nową tablicę ale w sumie po co????
        // jak można to na stringach zrobić
        for (int i = 0; i < strTablica1.length; i++) {
            strTablicaOdwrócona1[i] = strTablica1[strTablica1.length - 1 - i];
        }
        System.out.println(strTablicaOdwrócona1);

        System.out.println("======================================");
    }

    public static String reverse(String str) {
        char strTablica2[] = str.toCharArray();
        char strTablicaOdwrócona2[] = new char[strTablica2.length];
        // trzeba utworzyć nową tablicę ale w sumie po co????
        // jak można to na stringach zrobić
        for (int i = 0; i < strTablica2.length; i++) {
            strTablicaOdwrócona2[i] = strTablica2[strTablica2.length - 1 - i];
        }
        return String.valueOf(strTablicaOdwrócona2);
    }
}



