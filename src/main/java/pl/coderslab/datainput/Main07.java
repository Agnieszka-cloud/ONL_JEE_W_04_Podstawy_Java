/*
    W pliku `Main07.java` stwórz metodę o sygnaturze:

        `public static void nettoBrutto()`, która:

        1. wczyta z konsoli typ wyliczenia dostępne wartości to:
        bn - zamiana brutto na netto
        nb -  zamiana netto na brutto
        2. wczyta z konsoli wartość do zamiany a następnie dokona zamiany wg wcześniej określonego typu.

        W przypadku otrzymania wartości innej niż możliwe **bn**, **nb** &ndash; program będzie pytał do skutku.
        Wywołaj metodę w metodzie `main`.

        metoda
        poprosi użytkownika o wybór skrótu, który w dalszej kolejności uruchomi jedno z dwóch działań:
        pod skrótem bn metoda będzie rozumiała, że ma obliczyć brutto
        z podanej następnie wartości kwoty
        pod skrótem nb będzie rozumiał, że ma obliczyć netto
 */
package pl.coderslab.datainput;

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {

        nettoBrutto();
    }
    public static void nettoBrutto(){
        System.out.println("Wybierz co chcesz obliczyć: \n bn - obliczy brutto \n nb - obliczy netto");
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        double vat = 0.23;
        //double vat = 0.18;
        while(scanner.hasNextLine()){
            answer = scanner.next();
            if(answer.equals("bn")|| answer.equals("nb")){
                scanner.hasNextLine();
            }else {
                System.out.println("Niewłaściwe dane.Wybierz co chcesz obliczyć: \n bn - obliczy brutto \n nb - obliczy netto\" ");
                scanner.next();
            }
            System.out.println("Podaj cenę:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Niewłaściwy format danych. Podaj liczbę:");
                scanner.next();
            }
            double price = scanner.nextDouble();
            System.out.println(        answer.equals("bn")     ?
                    // brutto = 100x + 23x = 1x + 0,23x = x(1+0.23)
                    "brutto: "+String.format("%2f",price*(1+vat)) + "vat: " + String.format("%2f", price * vat)
                    : "netto: " +String.format("%2f", price/(1+vat))
            );
        }
    }
}

