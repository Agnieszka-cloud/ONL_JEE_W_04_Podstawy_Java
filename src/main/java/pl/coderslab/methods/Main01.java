/*
W pliku `Main01.java` napisz metodę o sygnaturze:

        `public static int multiply(int multipler, int index)`,

        która zwróci wartość zmiennej `multipler`

        pomnożonej przez wartość argumentu `index`.
*/
package pl.coderslab.methods;

public class Main01 {

    public static void main(String[] args) {
        int multiplier = 8;
        int index = 7;
        int resultOfMethod = multiply(multiplier,index);
        System.out.println(resultOfMethod);
        System.out.println(mnożenie(3,9));
    }
    public static int multiply(int multipler, int index){
        int resultOfMultiply = multipler * index;
        return resultOfMultiply;
    }
    public static int mnożenie(int mnożony, int przez){
        int wynik = mnożony * przez;
        return wynik;
    }
}
