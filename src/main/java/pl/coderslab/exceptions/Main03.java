// W pliku Main03.java umieszczony został program
// powodujący rzucenie wyjątku.
// uruchom program i zaobserwuj jaki wyjątek został rzucony,
// zmodyfikuj kod tak, aby zabezpieczyć go przed rzuceniem
// wyjątku, (zmodyfikuj kod tak, by w tym miejscu ten wyjątek
// nie był rzucany).
package pl.coderslab.exceptions;
public class Main03 {
    public static void main(String[] args) {
        String str = null;
        //String str = "Aga";
        showLength2(str);
        // wersja z obsługą wyjątku
        try {
            showLength1(str);
        }catch (NullPointerException e){
            System.out.println("Obiekt typu String " +
                    "jest nullem czyli nie istnieje, nie ma go.");
            e.printStackTrace();
        }
    }
    static void showLength1(String str) {
        /*if(str == null){
            throw new NullPointerException();
        }*/ //DLACZEGO TEGO NIE POTRZEBUJĘ TUTAJ????
        System.out.println(str.length());
    }
    // wersja bez obsługi wyjątku i też będzie działać
    public static void showLength2(String str){
        System.out.println(str != null ? str.length() : "Obiekt jest nullem czyli nie istnieje.");
    }
}
