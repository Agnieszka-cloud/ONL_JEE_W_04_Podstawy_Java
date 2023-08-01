/*
    W pliku `Main06.java` stwórz metodę o sygnaturze:

        `public static void equation()`, która:

        1. poprosi o podanie liczb całkowitych `a`, `b`, `c`,
        2. obliczy pierwiastki równania kwadratowego, a następnie je wyświetli.
        Wywołaj metodę w metodzie `main`.
 */
package pl.coderslab.datainput;

import java.util.Scanner;

public class Main06 {
// PIERWIASTEK Z RÓWNANIA KWADRATOWEGO
    public static void main(String[] args) {
        equation();
    }
    public static void equation(){
        Scanner scanner = new Scanner(System.in);
        double delta;
        System.out.println("Podaj liczbę a :");
        while (!scanner.hasNextDouble()) {
            System.out.println("Błąd formatu, podaj liczbę całkowitą:");
            scanner.next();
        }
        double a = scanner.nextDouble();
        if (a == 0 || a < 0) {
            System.out.println("Liczba musi być większa od 0, Podaj liczbę dodatnią:");
            scanner.next();
        }
        System.out.println("Podaj liczbę b :");
        while (!scanner.hasNextDouble()) {
            System.out.println("Błąd formatu, podaj liczbę całkowitą:");
            scanner.next();
        }
        double b = scanner.nextDouble();
        if (b <= 0) {
            System.out.println("Liczba musi być większa od 0, Podaj liczbę dodatnią:");
            scanner.next();
        }
        System.out.println("Podaj liczbę c :");
        while (!scanner.hasNextDouble()) {
            System.out.println("Błąd formatu, podaj liczbę całkowitą:");
            scanner.next();
        }
        double c = scanner.nextDouble();
        if (c <= 0) {
            System.out.println("Liczba musi być większa od 0, Podaj liczbę dodatnią:");
        }
        delta = b * b - 4 * a * c; // wyróżnik równania kwadratowego
        if (delta < 0) {
            System.out.println("Równanie nie posiada rozwiązań rzeczywistych");
        } else {
            /*System.out.print("Równanie posiada " + (delta == 0         ?
                    ("jedno rozwiązanie: " + String.format("%.2f", (-b / (2 * a))))
                    :
                    ("  dwa rozwiązania: " + String.format("%.2f", (-b + Math.sqrt(delta)) / (2 * a)) +
                            "      oraz  " + String.format("%.2f", (-b - Math.sqrt(delta)) / (2 * a)))));*/
            System.out.println(
                    delta == 0 ?
                            String.format("%2f", (-b / ( 2 * a)))
                            :
                            String.format("%2f", (-b + Math.sqrt(delta)) / (2 * a)) +
                                    String.format("%2f",(-b - Math.sqrt(delta)) / (2 * a)));
        }
    }
}

