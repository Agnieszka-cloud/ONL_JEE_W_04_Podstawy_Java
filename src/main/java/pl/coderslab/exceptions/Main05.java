//W pliku Main05.java znajduje się program,
// który zwraca wyjątek.
// uruchom program i zaobserwuj jaki wyjątek został zwrócony,
// dodaj do kodu obsługę odpowiedniego wyjątku,
// dodaj do kodu sekcję, która wykona się niezależnie od tego,
// czy wyjątek zostanie rzucony, czy nie,
// przetestuj działanie programu wywołując metodę parseInt z
// oprawnym i z niepoprawnym parametrem.
package pl.coderslab.exceptions;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        // String s = "jiig";
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków będących liczbą: ");
        String s = sc.next();
        try {
            int num = Integer.parseInt(s) ;
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Podany ciąg znaków nie jest liczbą.");
            e.printStackTrace();
        }finally {
            System.out.println("Ten program wyświetla tylko liczby.");
        }
    }
}
