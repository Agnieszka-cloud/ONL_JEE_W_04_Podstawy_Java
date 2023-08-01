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

import javax.xml.stream.FactoryConfigurationError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class main5List {
    public static void main(String[] args ){
        readFromFile("text5.txt");
    }
    public static void readFromFile(String fileName){
        Path path = Paths.get(fileName);
        Path path1 = Paths.get(fileName.replace(".txt","5.html"));
        List<String> doZapisuWPliku = new ArrayList<>();

        try {
            if (Files.exists(path)) {
                Files.createFile(path1);
            }else {
                System.out.println("Plik źródłowy nie istnieje.");
            }
            doZapisuWPliku.add("<html>");
            doZapisuWPliku.add("<body>");
            for (String line : Files.readAllLines(path)){
                doZapisuWPliku.add("<p>" + line + "</p>");
            }
            doZapisuWPliku.add("</body>");
            doZapisuWPliku.add("</html>");

            Files.write(path1,doZapisuWPliku);
        }catch(IOException e){
            System.out.println("Plik docelowy już istnieje.");
            e.printStackTrace();
        }
    }
}
