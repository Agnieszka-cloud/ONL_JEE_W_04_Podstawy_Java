/*W pliku `Main02.java` stwórz metodę o sygnaturze:
        `public static void createFile (String fileName)`.
        1. uzupełnij ciało metody tak, aby tworzyła plik o zadanej nazwie,
        2. sprawdzaj czy plik nie istnieje,
        3. wykorzystaj metody klas pakietu `java.nio.file`.*/
package pl.coderslab.filesnio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main02 {
    public static void main(String[] args) {

        createFile("text3.txt");
    }
    public static void createFile (String fileName){
        Path path = Paths.get(fileName);
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            } else {
                System.out.println("Plik już istnieje.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
