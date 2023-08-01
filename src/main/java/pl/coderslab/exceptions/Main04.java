// W pliku Main04.java znajduje się program
// z obsługą dwóch wyjątków.
// uruchom program i zaobserwuj jaki wyjątek został zwrócony,
// usuń komentarz i popraw kod tak,
// aby dodatkowy wyjątek z komentarza był poprawnie obsługiwany,
// uruchom ponownie program i zaobserwuj jaki wyjątek został zwrócony?
package pl.coderslab.exceptions;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj liczbę a: ");
            double a = sc.nextInt();
            System.out.println("Podaj liczbę b: ");
            double b = sc.nextInt();
            //int a = 1, b = 0, c;
            double c = a / b ;
            System.out.println(c);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception: " +
                    "You can't divide by 0");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Exception");
            ex.printStackTrace();
        }
    }
}
