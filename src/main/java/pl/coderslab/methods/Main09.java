/*
W pliku `Main09.java` napisz publiczną metodę `factorial`
        czyli silnia,
        która przyjmie jako parametr liczbę naturalną `n`.
        Metoda ma zwrócić wartość `n!`,czyli wynik mnożenia
        wszystkich liczb naturalnych w zakresie `1...n`.
*/
package pl.coderslab.methods;

public class Main09 {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(silnia1(4));
        System.out.println(silnia2(4));
    }

    // silnia n!
    public static int factorial (int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int silnia1 (int n){
        int silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    public static int silnia2(int n){
        int silnia = 1;
        for (int i = 1; i <=n ; i++) {
            silnia =  silnia * i;
        }
        return silnia;
    }
}
