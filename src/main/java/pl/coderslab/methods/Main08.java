/*
W pliku `Main08.java` napisz publiczną metodę `maxOfThree`,
        która przyjmie trzy parametry liczbowe.
        Metoda ma zwrócić największą liczbę.
*/
package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args) {
        int test1 = 8;
        int test2 = 99;
        int test3 = 76;
        System.out.println(maxOfThree(test1,test2,test3));
        System.out.println(największaZTrzech(7,5,4));
    }

    public static int maxOfThree (int a, int b, int c){
        if (a > b && a > c){
            return a;
        }else if (b > a && b > c) {
            return b;
        } else
            return c;
    }

    public static int największaZTrzech (int one, int two, int three){
        if (one > two && one > three){
            return one;
        } else if (two > one && two > three){
            return two;
        } else return three;
    }
}
