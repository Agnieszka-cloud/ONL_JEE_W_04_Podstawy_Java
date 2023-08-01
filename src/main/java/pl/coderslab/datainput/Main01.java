// ROZDZIAŁ WPROWADZANIE DANYCH

/*      W pliku `Main01.java` stwórz metodę o sygnaturze:

        `public static void getInfo()`.

        W ciele metody dodaj kod, który:

        1. poprosi Cię o podanie imienia,
        2. poprosi Cię o podanie wieku,
        3. wypisze na konsoli informacje w formacie `"{imię} ma {wiek} lat"`.
        Wywołaj metodę w metodzie `main`.   */

package pl.coderslab.datainput;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        getInfo();
    }
    public static void getInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();

        System.out.println("Podaj wiek: ");


        while (!scanner.hasNextInt()){
            System.out.println("Nieprawidłowa wartość, podaj ponownie wiek");
            scanner.nextLine();
        }
        String age = scanner.nextLine();
        System.out.println(name + " ma " + age + " lata.");
    }
}
