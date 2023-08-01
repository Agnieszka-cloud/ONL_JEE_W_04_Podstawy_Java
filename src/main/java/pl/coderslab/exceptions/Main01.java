/*
 W pliku `Main01.java` została umieszczona metoda o sygnaturze:
 `public static int factorial(int number)`
 zwracająca silnię liczby naturalnej przekazanej w parametrze.
 1. zmodyfikuj kod tak, aby metoda zwracała wyjątek
 `IllegalArgumentException`
 w sytuacji, gdy liczba `number` przekazana w parametrze będzie
 mniejsza od zera,
 2. zwróć uwagę czy jest to wyjątek kontrolowany czy
 niekontrolowany i dlaczego,
 3. przetestuj działanie programu wywołując metodę `factorial`
 z poprawnym i z niepoprawnym parametrem,
 4. przy wywołaniu metody `factorial` dodaj obsługę wyjątku
 `IllegalArgumentException`,
 5. przetestuj ponownie działanie programu.
*/
package pl.coderslab.exceptions;
import java.util.Scanner;
public class Main01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj silnię do policzenia:");
        int number = scanner.nextInt();
        try{
            System.out.println("Z liczby: " +
                    number + " silnia wynosi: " + factorial(number));
        } catch (IllegalArgumentException e){
            System.out.println("Liczba ujemna jest niedozwolona");
            e.printStackTrace();
        }
    }

    public static int factorial(int number) {
        if(number < 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i; // 1 * 1 = 1 * 2 = 2 * 3 = 6 * 4 = 24 * 5 = 120 silnia z 5
        }
        return result;
    }
}
