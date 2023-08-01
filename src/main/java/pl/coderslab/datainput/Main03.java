/*
        W pliku `Main03.java` stwórz metodę o sygnaturze:

        `public static void getData()`.

        Uzupełnij ciało metody tak, aby:

        1. wczytywała liczby z konsoli do momentu
        wprowadzania 0 (ale nie włączając go do sumy liczb),
        2. sumowała ich wartość oraz liczbę.
        Wywołaj metodę w metodzie `main`.
*/

        package pl.coderslab.datainput;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        getData();

    }
    public static void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do dodawania:");
        boolean stopCounting = false;
        int number = 0;
        int sume = 0;
        int amountOfNumbers = 0;
        while(!stopCounting) {
            while (!scanner.hasNextInt()) {
                System.out.println("podaj poprawne dane:");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number == 0) {
                stopCounting = true;
            } else {
                sume = sume +  number;
                amountOfNumbers++;
            }
        }
        System.out.println("suma liczb wynosi: " +  sume);
        System.out.println("ilość podanych liczb: " + amountOfNumbers);
    }
}
