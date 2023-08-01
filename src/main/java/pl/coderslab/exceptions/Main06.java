// W pliku Main06.java została umieszczona metoda o sygnaturze:
// public static int divide (int a, int b).
// uzupełnij ciało metody tak, aby wykonała dzielenie
// parametru a przez b i zwróciła całkowitą cześć wyniku dzielenia,
// wywołaj metodę divide przekazując parametr b o wartość 0
// i zaobserwuj jaki wyjątek zostanie zwrócony po uruchomieniu programu,
// zmodyfikuj kod tak, aby metoda divide zwracała wyjątek
// IllegalArgumentException w sytuacji gdy parametr b będzie równy 0,
// uruchom ponownie program i zaobserwuj jaki wyjątek zostanie zwrócony,
// w metodzie main dodaj obsługę wyjątku IllegalArgumentException,
// przetestuj działanie programu przekazując do metody divide
// poprawny i niepoprawny parametr b.
package pl.coderslab.exceptions;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę a czyli liczbę podzielną: ");
        int a = sc.nextInt();
        System.out.println("Podaj liczbę b czyli " +
                "przez ile będzie dzielone: ");
        int b = sc.nextInt();

        /*  int a = 6;
            int b = 0;  */
        try {
            System.out.println("wynik dzielenia: "+ divide(a,b));
        }catch (IllegalArgumentException e){
            System.out.println("Nie dzieli się przez 0.");
            e.printStackTrace();
        }
    }

    static int divide (int a, int b){
        if (b==0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }
}
