package pl.coderslab.datainput;

import java.util.Scanner;

public class main4 {
    public static void main(String[]args){
        rowsColumns();
    }

    public static void rowsColumns() {
        Scanner scanner = new Scanner(System.in);
        int zew = 0;
        int wew = 0;
        boolean MamLiczbe = false;
        System.out.println("Podaj liczbę wierszy: ");

        while (!MamLiczbe) {
            while (!scanner.hasNextInt()) {
                System.out.println("Podana wartość nie jest liczbą, " +
                        "podaj poprawną wartość:");
                scanner.next();
            }
            zew = scanner.nextInt();
            if (zew > 0) {
                MamLiczbe = true;
            } else {
                System.out.println("Liczba nie może być równa ani mniejsza od zera. " +
                        "Podaj liczbę większą od zera");
            }
        }
        MamLiczbe = false;

        System.out.println("Podaj liczbę kolumn:");
        while (!MamLiczbe) {
            while (!scanner.hasNextInt()) {
                System.out.println("Podana wartość nie jest liczbą, " +
                        "podaj liczbę dodatnią całkowitą.");
                scanner.next();
            }
            wew = scanner.nextInt();
            if (wew > 0) {
                MamLiczbe = true;
            } else {
                System.out.println("Podana wartość nie jest liczbą, " +
                        "podaj liczbę dodatnią całkowitą.");
            }
        }
        int[][] tablica = new int[zew][wew];
        int k = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                //tablica[i][j] = i * tablica[i].length + j;
                tablica[i][j] = k;
                k++;
                System.out.print(tablica[i][j]);
            }
        }
    }
}
