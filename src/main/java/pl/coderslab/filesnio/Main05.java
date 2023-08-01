/*      W pliku `Main05.java` stwórz metodę o sygnaturze:

        `public static void readFromFile(String fileName)`.

        Uzupełnij ciało metody tak, aby:

        1. wczytała zawartość pliku podanego w parametrze
        metody (sprawdzaj czy istnieje plik źródłowy),
        2. utworzyła nowy plik o rozszerzeniu `html`
        i nazwie takiej samej jak plik wczytywany,
        3. wpisywała do nowego pliku dane w postaci `html`,
        gdzie każda linia pliku wczytanego będzie się znajdować w tagu `<p>`.

        Przykład:
        ```html
<html>
<body>
<p>pierwsza linia</p>
<p>druga linia</p>
</body>
</html>

        ```*/
package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main05 {

    public static void main(String[] args) {

        readFromFile("text5.txt");
    }
    public static void readFromFile(String filename) {
        Path textPath1 = Paths.get(filename);
        Path htmlPath2 = Paths.get(filename.replace(".txt","55.html"));
        try {
            if(!Files.exists(htmlPath2)){
                Files.createFile(htmlPath2);
            }else {
                System.out.println("Plik docelowy już istnieje.");
            }
            Files.writeString(htmlPath2,"<html><body>");

            for(String line : Files.readAllLines(textPath1)) {
                Files.writeString(htmlPath2, "<p>" + line + "</p>\n",StandardOpenOption.APPEND);
            }

            Files.writeString(htmlPath2,"</body>\n</html>\n", StandardOpenOption.APPEND);

        }catch (IOException e){
            System.out.println("Plik źródłowy nie istnieje.");
            e.printStackTrace();
        }
    }
}
