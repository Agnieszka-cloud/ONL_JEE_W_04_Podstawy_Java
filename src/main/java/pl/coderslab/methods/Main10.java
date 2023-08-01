/*
        Gdy klub piłkarski A gra dwumecz z klubem piłkarskim B,
        oznacza to, że grają jeden mecz na boisku drużyny A i
        jeden na boisku drużyny B.
        Wygrywa ta drużyna, która zdobędzie więcej goli w obu meczach.
        W przypadku, gdy drużyny zdobyły tyle samo bramek, gole zdobyte
        na wyjeździe liczą się jako "trochę ważniejsze"
        i wygrywa ta drużyna, która zdobyła więcej bramek na wyjeździe.
        Remis w dwumeczu wypada wtedy, gdy obie drużyny zdobyły
        tyle samo bramek i mają tyle samo bramek na wyjeździe.
*/
package pl.coderslab.methods;

import java.lang.invoke.SwitchPoint;

public class Main10 {

    public static void main(String[] args) {

        System.out.println(footballWin(0,2,9,8));
        zwycięstwo(8,8,5,5);
        System.out.println(theWinner(7,8,7,7));
    }
    public static String footballWin (int xHome, int yGuest, int xGuest, int yHome) {
        int sumX = xHome + xGuest;
        int sumY = yHome + yGuest;
        if (sumX > sumY) {
            return "drużyna x";
        } else if (sumY > sumX) {
            return "drużyna y";
        } else {
            if (xGuest > yGuest) {
                return "drużyna x";
            }  else if (yGuest > xGuest) {
                return "drużyna y";
            }
            return "";
        }
    }

    public static void zwycięstwo( int bramkiA, int bramkiB, int bramkiAWyjazd, int bramkiBWyjazd){
        int sumaA = bramkiA + bramkiAWyjazd;
        int sumaB = bramkiB + bramkiBWyjazd;
        if (bramkiA == bramkiB && bramkiAWyjazd > bramkiBWyjazd){
            System.out.println ("drużyna A is the winner");
        } else if (bramkiB == bramkiA && bramkiBWyjazd > bramkiAWyjazd){
            System.out.println("drużyna B is the winner");
        } else if (sumaA > sumaB){
            System.out.println("drużyna A is the winner");
        } else if (sumaB > sumaA){
            System.out.println("drużyna B is the winner");
        } else if (sumaA == sumaB){
            System.out.println("remis");
        }
    }
    public static String theWinner (int a, int b, int aa, int bb){
        int sumeA = a + aa;
        int sumeB = b + bb;
        if(sumeA > sumeB){
            return "The winner is the team A";
        } else if (a > aa && b > bb){
            return "The winner is the team A";
        } else if ( a == b && aa == bb){
            return "remis";
        } else
            return "The winner is the team B";
    }
}
