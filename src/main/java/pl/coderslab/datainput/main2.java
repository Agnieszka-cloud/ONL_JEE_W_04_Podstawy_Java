/*
W pliku `Main02.java` stwórz metodę o sygnaturze:

        `public static void operations()`.

        Uzupełnij ciało metody tak, by wczytała 2 liczby, a następnie wyświetliła na konsoli wyniki:
        1. dodawania,
        2. odejmowania,
        3. mnożenia,
        4. dzielenia.
        Wywołaj metodę w metodzie `main`.
*/
package pl.coderslab.datainput;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        operations();

    }

    public static void operations() {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Podaj pierwszą liczbę:");
        while (!scan.hasNextInt()) {
            System.out.println("podana wartość nie jest liczbą, podaj poprawną wartość:");

            scan.nextLine();

        }
        a = scan.nextInt();

        System.out.println("Podaj drugą liczbę:");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("podana wartość nie jest liczbą, podaj poprawną wartość:");

        }
        b = scan.nextInt();

        System.out.println("Suma liczb: " + (a + b));
        System.out.println("Różnica liczb: " + (a - b));
        System.out.println("Iloczyn liczb: " + (a * b));
        System.out.println(b == 0 ? "brak możliwości dzielenia przez 0" : "Iloraz liczb: " + ((double) a / (double) b));


    }
}
