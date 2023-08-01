/*
W pliku `Main01.java` napisz program, który:

1. podzieli na wyrazy ciąg znaków przechowywany w zmiennej `str`,
   znajdującej się w pliku,
2. wyświetli na konsoli każdy z tych wyrazów w oddzielnej linii.

*/
// ROZDZIAŁ TWORZENIE I PODZIAŁ NAPISÓW
package pl.coderslab.cutstrings;

public class Main01 {

    public static void main(String[] args) {

        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";

        String [] array = str.split(" ");
        for(String word : array){
            System.out.println(word);

        }

    }

}
