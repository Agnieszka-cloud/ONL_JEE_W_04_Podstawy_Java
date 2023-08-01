/*
W pliku `Main02.java` napisz program,
który będzie wczytywał kolejne linie
tekstu z pliku `text1.txt`,
a następnie wypisze je na konsoli.
*/
package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        File file = new File("text1.txt"); // ścieżka do pliku
        StringBuilder sb = new StringBuilder();  // tworzy obiekt,
        // w którym będzie przechowywał
        try {
            Scanner scanner = new Scanner(file); // pobiera z pliku
            while (scanner.hasNextLine()) { // dopóki ma linie
                sb.append(scanner.nextLine() + "\n"); // dodaje elementy komendą

            }
            // scanner.close(); ???
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(sb.toString() + sb.toString());

    }
    /*try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }*/
}
