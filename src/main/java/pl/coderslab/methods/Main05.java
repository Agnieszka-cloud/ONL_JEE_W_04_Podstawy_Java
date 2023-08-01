/*
W pliku `Main05.java` napisz publiczną metodę `calculateNetto`, która przyjmie argumenty:

        * `gross`: kwotę brutto ceny zakupu,
        * `vat`: wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 &ndash; 1.

        Metoda ma zwrócić wartość netto ceny. Napisz w komentarzu, jakie obliczenia musisz wykonać.

*/

        package pl.coderslab.methods;

import com.sun.source.doctree.ValueTree;

public class Main05 {

    public static void main(String[] args) {
        double VAT = 18;
        double BRUTTO = 472;
        double result = calculateNetto(BRUTTO,VAT);
        System.out.println(result);
        System.out.println(obliczNetto(492,0.23));
        System.out.println(netto(678,23));
        System.out.println(albo(472,0.18));
    }
    public static double calculateNetto (double brutto, double vatLiczbaCałkowita) {
        double preparedVat = vatLiczbaCałkowita / 100;
        double netto = brutto / (preparedVat + 1);
        double valueVat = netto * preparedVat;
        System.out.println(valueVat);
        return netto;
    }
    //albo
    public static double netto (double gross, double vatLiczbaCałkowitaProcenty) {
        double vatDouble = vatLiczbaCałkowitaProcenty / 100;
        double pre = vatDouble + 1.0;
        return gross / pre;
    }
    //albo
    public static double albo(double brutto, double vat){
        // brutto = vat + netto
        // netto = x
        // brutto = vatx + x
        // brutto = x(vat + 1)
        // brutto= x(vat + 1)     / (vat +1)
        // x = brutto/(vat + 1)   // z/y = z*1/y = z/y
        // x = brutto *1/(1+vat)

        return brutto * 1/(1+vat);
    }

    //rozpisanie
//        x = netto
//        18%x + 100%x = brutto
//        0.18x + 1x = brutto
//        (vat + 1)x = brutto
//        x = brutto / vat + 1
    //return = brutto / vat + 1

    public static double obliczNetto ( double brutto, double vat){

        return brutto / (vat + 1);
    }
}

