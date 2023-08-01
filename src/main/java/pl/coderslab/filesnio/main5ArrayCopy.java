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

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class main5ArrayCopy {
    public static void main(String []args ){
        try {
            readFromFile("text5.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void readFromFile(String filename) throws IOException {
        File file = new File(filename);
        Path path = Paths.get(filename.replace(".txt","555.html"));
        String[]array =new String[0];
        Scanner scanner = new Scanner(file);
        Files.writeString(path,"<html>\n<body>\n");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            array = Arrays.copyOf(array,array.length + 1);
            array[array.length - 1] = "<p>" + line + "</p>\n";
        }
        System.out.println(Arrays.toString(array));
        Files.writeString(path,Arrays.toString(array), StandardOpenOption.APPEND);
        Files.writeString(path,"</body>\n</html>\n",StandardOpenOption.APPEND);
    }
}
