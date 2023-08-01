/*W pliku `Main02.java` napisz metodę o sygnaturze:

        `public static int square(int num)`,

        która zwróci wartość `num` podniesioną do kwadratu.*/

package pl.coderslab.methods;

public class Main02 {

    public static void main(String[] args) {
        int num = 4;
        int squared = square(num);
        System.out.println(squared);
        System.out.println("==================");
        System.out.println(doKwadratu(8));
    }
    public static int square(int num){
        int result  = num * num;
        // return num * num
        return result;
    }
    public static int doKwadratu(int liczba){
        int liczbaDoKwadratu = liczba * liczba;
        return liczbaDoKwadratu;
    }
}
