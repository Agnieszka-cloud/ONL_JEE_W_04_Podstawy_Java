/* W pliku `Main03.java` stwórz metodę o sygnaturze:
   public static void copyFile(String directory,
   String fileName, String secondFileName)`.
   Następnie:
   1. uzupełnij ciało metody tak, aby z katalogu `directory`
   kopiowała plik o nazwie `fileName` do pliku o nazwie `secondFileName`.
   2. sprawdzaj czy plik nie istnieje.
*/
package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main03 {
    public static void main(String[] args) {

        copyFile("Katalog","text1.txt","text2.txt");
    }
    public static void copyFile(String directory,String fileName,String secondFileNome) {
        Path toCopy = Paths.get(directory + "/" + fileName);
        Path copied = Paths.get(directory + "/" + secondFileNome);
        /*try {
            if (!Files.exists(toCopy)) {
                Files.createFile(toCopy);
            } else {
                System.out.println("Plik już istnieje.");
            }
            Files.copy(toCopy, copied);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            if (Files.exists(toCopy)) {
                Files.copy(toCopy, copied, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
