/*
W pliku `Main05.java` napisz program który:

        1. wczyta zawartość z załączonego pliku text5.txt,
        2. posortuje znajdujące się tam nazwy języków programowania
        oraz zapisze wynik i wyświetli na konsoli.
        Lista języków pobrana z rankingu:

        [http://www.tiobe.com/tiobe-index/](http://www.tiobe.com/tiobe-index/)

        Zgadnij jaki język jest na samej górze?
*/

        package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        File file = new File("text5.txt");
        try {
            String[] array = new String[0];
            System.out.println(Arrays.toString(array));
            Scanner scanner = new Scanner(file);
            //DOPÓKI AS LONG AS HAS NEXT LINE DO SOMETHING
            while (scanner.hasNextLine()) {
                array = Arrays.copyOf(array, array.length + 1);
                //array[0]= scanner.nextLine();// to jest to poniżej
                array[array.length -1] = scanner.nextLine();
            }
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            //scanner.close();  // czy dobrze,
            // że ręcznie zamknęłam źródło
            // metodą close przy scanerze????
        }catch(FileNotFoundException e){
            System.out.println("Brak pliku.");
        }
    }
}
