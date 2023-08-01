/*
W pliku `Main06.java` napisz publiczną metodę `checkMaturity`, która:

        * przyjmie parametr liczbowy `age` oznaczający wiek użytkownika,
        * sprawdzi, czy użytkownik jest pełnoletni,
        * zwróci wartość `true` &ndash; jeśli jest pełnoletni,
        * zwróci wartość `false` &ndash; jeśli nie jest.
*/

package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        int userAge = 18;
        System.out.println(checkMaturity(userAge));
        System.out.println(sprawdźCzyPełnoletni(19));
        System.out.println(sprawdźCzyPełnoletni1(7));
        System.out.println(sprawdźCzy(7));
    }
    public static boolean checkMaturity(int age) {
        boolean isMatur;
        if (age >= 18) {
            isMatur = true;
        } else
            isMatur = false;
        return isMatur;
    }
    public static boolean sprawdźCzy(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
    public static boolean sprawdźCzyPełnoletni(int age) {
        boolean czyPełnoletni = false;
        if (age>= 18){
            czyPełnoletni = true;
        }
        return czyPełnoletni;
    }
    public static boolean sprawdźCzyPełnoletni1(int age) {
        boolean czyPełnoletni = true;
        if (age < 18) {
            czyPełnoletni = false;
        }
        return czyPełnoletni;
    }
}



