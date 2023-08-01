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

public class Main02 {

    public static void main(String[] args) {

        operations();
    }
    public static void operations(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        while (!scanner.hasNextInt()){
            System.out.println("Nieprawidłowe dane, podaj liczbę ponownie:");
            scanner.nextLine();
        }
        int x = scanner.nextInt();
        System.out.println("Podaj druga liczbę:");
        int y = scanner.nextInt();
        int suma = x + y;
        int różnica = x - y;
        int mnożenie = x * y;
        int dzielenie = x / y;
        System.out.println(x + " * " + y + " = " + mnożenie);
        System.out.println();
        System.out.println();
        System.out.println(x + "+" + y + "=" + suma);
        System.out.println(x + "-" + y + "=" + różnica);
        System.out.println(x + "/" + y + "=" + dzielenie);
    }
}
