package pl.coderslab.exceptions;

import java.util.Scanner;

public class exception7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę a czyli liczbę podzielną: ");
        double a = sc.nextDouble();
        System.out.println("Podaj liczbę b czyli " +
                "przez ile będzie dzielone: ");
        double b = sc.nextDouble();
        /*  int a = 6;
            int b = 0;  */
        try {
            System.out.println("wynik dzielenia: "+ divide(a,b));
        }catch (IllegalArgumentException e){
            System.out.println("Nie dzieli się przez 0.");
            e.printStackTrace();
        }
}

    static double divide (double a, double b){
        if (b==0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }
}
