/*
        W pliku `Main05.java` stwórz metodę o sygnaturze:

        `public static void textLines()`,

        która wczyta kolejne linie tekstu z konsoli,a następnie je wyświetli.

        Program ma zakończyć działanie po wpisaniu `quit` (ale już bez wyświetlania go na konsoli).

        Wywołaj metodę w metodzie `main`.
*/

        package pl.coderslab.datainput;

import java.util.Arrays;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        textLines();
    }
    public static void textLines(){
        boolean hasText = true;
        String  text;
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Podaj tekst:");
        // mogłoby być tylko po prostu
        // while (true)
        while (hasText){
            text = scanner.nextLine();
            if(text.equals("quit")){
                break;
                //hasText = false;
            }else{
                stringBuilder.append(text + "\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
