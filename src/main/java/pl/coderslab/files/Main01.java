/*
W pliku `Main01.java` napisz program, który będzie wczytywał kolejne
linie tekstu z konsoli,
a następnie zapisywał je do pliku o nazwie `text1.txt`.
Program ma zakończyć działanie po wpisaniu słowa `quit`
(bez zapisywania go do pliku `text1 .txt`).
*/

package pl.coderslab.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj treść do zapisu w pliku text1");
        try (PrintWriter printWriter = new PrintWriter("text1.txt")){
            while (true) {
                String doZapisuWPliku = scanner.nextLine();
                if (doZapisuWPliku.equals("quit")) {
                    return;
                }
                printWriter.println(doZapisuWPliku);
            }
            // scanner.close(); ??? nie
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*try {PrintWriter printWriter = new PrintWriter("text2.txt");
            while (true) {
                String doZapisu = scanner.nextLine();
                if (doZapisu.equals("quit")) {
                    return;
                }
                printWriter.println(doZapisu);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("koniec zapisu");
        }*/
    }
}
