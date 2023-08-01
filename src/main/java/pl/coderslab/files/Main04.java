/*
W pliku `Main04.java` napisz program, który:
1. wczyta zawartość z załączonego pliku text4.txt,
2. wypisze na konsoli wszystkie linie zawierające
napis **Javy**, ignorując wielkość znaków w nazwie.
*/
package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        File file = new File("text4.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String javyLine = scanner.nextLine();
                if(javyLine.contains("Javy")){
                    System.out.println(javyLine);
                }
            }
            // scanner.close(); ???
        }catch (FileNotFoundException e){
            System.out.println("brak pliku");
        }
    }
}

