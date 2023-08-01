/*
W pliku `Main04.java` stwórz metodę o sygnaturze:
 `public static void writeToFile(String fileName)`.
Uzupełnij ciało metody tak, aby:
1. utworzyła (jeżeli nie istnieje) plik o nazwie `fileName`.
2. pobierała z konsoli całe linie, a następnie zapisywała je
   do pliku. Wykorzystaj odpowiednią metodę klasy `Scanner`.
3. Wczytuj dane do momentu wystąpienia napisu "quit"
*/
package pl.coderslab.filesnio;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        writeToFile("text1.txt");
    }
    public static void writeToFile(String fileName){
        //PrintWriter printWriter = null;
        Path path = Paths.get(fileName);
        List<String> list = new ArrayList<>();
        try {

            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj tekst do zapisu w pliku:");
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();


                list.add(line + ":");
                Files.write(path,list);
                if(line.equals("quit")){
                    return;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
            /*}finally {
            if(printWriter != null)
                printWriter.close();
        }*/
        }
    }
}
