/*
W pliku `Main03.java` napisz program,
który będzie wczytywał kolejne linie
tekstu z pliku tekstowego
wypełnionego poniższą zawartością:
Jeżeli dane są poprawnymi danymi liczbowymi,
program policzy ich sumę, jeśli nie –
ma je pomijać.
Następnie sumę ma zostać wypisana na konsoli.
*/
package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        File file = new File("text9.txt");
        double sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arrayOfSingleDouble = line.split(",");
                for (String one : arrayOfSingleDouble) {
                    try {
                        sum = sum + Double.parseDouble(one.trim());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
            // scanner.close(); ???
        }catch(FileNotFoundException e){
            System.out.println("brak pliku");
        }
        System.out.println(sum);
    }
}

