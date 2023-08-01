/*
W pliku `Main07.java` napisz publiczną metodę `checkEvenOdd`, która:

        * przyjmie parametr liczbowy `number`,
        * będzie zwracać wartość typu `String`,
        * zwróci wynik "even", jeśli liczba jest parzysta,
        * zwróci wynik "odd", jeśli liczba jest nieparzysta.
*/
package pl.coderslab.methods;

public class Main07 {

    public static void main(String[] args) {
        int sample = 24;
        System.out.println(checkEvenOdd(sample));
        System.out.println(checkEvenOddd(13));
        System.out.println(evenOdd(55));

    }
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    public static String checkEvenOddd(int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "even";
        } else if (number % 2 != 0) {
            result = "odd";
        }
        return result;
    }

    public static String evenOdd (int number){
        if( number % 2 == 0 ){
            return "even";
        }
        return "odd";
    }

}

