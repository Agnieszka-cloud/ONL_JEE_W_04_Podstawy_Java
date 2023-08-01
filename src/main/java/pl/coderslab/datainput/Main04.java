/*
       W pliku `Main04.java` stwórz metodę o sygnaturze:

        `public static void rowsColumns()`, która:

        1. wczyta z konsoli 2 liczby całkowite i przypisze je
        do zmiennych `rows` i `columns`,
        2. stworzy tablicę o podanej liczbie wierszy i kolumn,
        3. wypełni tablicę kolejnymi liczbami całkowitymi,
        4. obliczy i wyświetli na konsoli sumę wszystkich elementów,
        5. obliczy i wyświetli na konsoli średnią wszystkich elementów.
        Wywołaj metodę w metodzie `main`.
*/
package pl.coderslab.datainput;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        rowsColumns();
    }

    public static void powiesSkarpety(int liczbaSkarpet){
        boolean mamSkarpety = liczbaSkarpet > 0;

        while (mamSkarpety){
            liczbaSkarpet--;
            mamSkarpety = liczbaSkarpet > 0;
        }
    }

    public static void rowsColumns(){
        Scanner scanner = new Scanner(System.in);
        int zew = 0;
        int wew = 0;

        boolean czyMamLiczbe = false;
        System.out.println("Podaj liczbę wierszy: ");
        while (!czyMamLiczbe) {
            while (!scanner.hasNextInt()) {
                System.out.println("Podana wartość nie jest liczbą, " +
                        "podaj poprawną wartość:");
                scanner.next();
            }
            zew = scanner.nextInt();
            if (zew > 0) {
                czyMamLiczbe= true;
            }else {
                System.out.println("Liczba nie może być równa ani mniejsza od zera. " +
                        "Podaj liczbę większą od zera");
            }
        }

        czyMamLiczbe = false;
        System.out.println("Podaj liczbę kolumn:");
        while (!czyMamLiczbe) {
            while (!scanner.hasNextInt()) {
                System.out.println("Podana wartość nie jest liczbą, " +
                        "podaj liczbę dodatnią całkowitą.");
                scanner.next();
            }
            wew = scanner.nextInt();
            if (wew > 0) {
                czyMamLiczbe = true;
            }else{
                System.out.println("Podana wartość nie jest liczbą, " +
                        "podaj liczbę dodatnią całkowitą.");
            }
        }
        int [][] tablica = new int[zew][wew];
        int suma = 0;
        int k = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                //tablica[i][j] = i * tablica[i].length + j;
                tablica[i][j] = k;
                k++;
                System.out.print(tablica[i][j]);
                suma = suma + tablica[i][j];
            }
        }
        System.out.println();
        System.out.println("Suma z dodoawania elelemtów tablicy: " + suma);
        System.out.println("średnia liczb w tablicy; " + String.format("%.2f",(double) suma / (zew + wew)));
        System.out.println("średnia liczb w tablicy; " + String.format("%.2f", (double) suma / (zew * wew)));
        System.out.println(String.format("%.4f",(float) suma / (zew + wew)));
        System.out.println((double) 1);
    }
}

