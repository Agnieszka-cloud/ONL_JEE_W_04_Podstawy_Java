/*W pliku `Main01.java` stwórz metodę o sygnaturze:
`public static void createDirectory(String directoryName)`.
1. uzupełnij ciało metody tak, aby tworzyła katalog o zadanej nazwie,
2. sprawdzaj, czy katalog nie istnieje,
3. wykorzystaj metody klas pakietu `java.nio.file`:
- `Files.exists(directory)`,
- `Files.createDirectory(directory)`.*/
package pl.coderslab.filesnio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main01 {

    public static void main(String[] args) {
        //String directoryName = "Katalog";
        createDirectory("Katalog");
    }
    public static void  createDirectory(String directoryName){
        Path path = Paths.get(directoryName);
        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
            } else {
                System.out.println("Katalog juź istnieje.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
