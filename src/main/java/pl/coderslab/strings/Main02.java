/*
W pliku `Main02.java` umieść metodę o sygnaturze:

        `public static int charPos(String str, char c) `.

        Uzupełnij ciało metody tak, aby zwracała
        wartość pierwszego indeksu, (czyli int)
        pod którym w napisie `str`
        znajduje się znak `c`.

*/

package pl.coderslab.strings;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(charPosition1("blablabcla aa  a", 'c'));
        System.out.println("Jeśli nie występuje to będzie wartość ujemna: -1 a jeśli nie to: " + charPos("kocham wariata",'w'));
        System.out.println(charPosition("piękny dzień w sąsiedztwie",'c'));
        System.out.println("Jeśli nie występuje to będzie wartość ujemna: " + charPositio("metal czy rock",'n'));
    }
    public static int charPosition1(String str, char c){
        int numerPozycjiNaKtórejPojawiaSięPierwszyRazZnakC = -1;
        for( int i =0; i< str.length(); i++){
            if (str.charAt(i) == c){
                return i;
            }
        }
        return numerPozycjiNaKtórejPojawiaSięPierwszyRazZnakC;
    }
    public static int charPositio (String str, char c) {
        int numerIndeksu = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
    public static int charPosition( String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
    public static int charPos(String str, char ch){
        return str.indexOf(ch);
    }
}
