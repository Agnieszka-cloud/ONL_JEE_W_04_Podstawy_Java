/*W pliku `Main03.java` napisz publiczną metodę `convertToUsd`,

        która przyjmuje parametr `pln`, czyli kwotę w złotówkach.

        Metoda ma zwrócić podaną kwotę w dolarach amerykańskich.

        Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.*/

        package pl.coderslab.methods;

public class Main03 {
    public static void main(String[] args) {
        double pln = 5.0;
        double converted = convertToUsd(pln);
        System.out.println(converted);
        System.out.println("=====================");
        System.out.println(przeliczNaDolary(12));
    }
    public static double convertToUsd( double pln){
        double usd = pln / 4.04;
        return usd;
    }
    public static double przeliczNaDolary (double pln){
        // 1 usd = 4.04 pln
        // x usd = 10 pln
        // 4.04 x usd = 10 pln
        // x usd = 10 pln % 4.04
        double usd = pln / 4.79;
        return usd;
    }
}
