//W pliku Main02.java umieszczony został program powodujący
// rzucenie wyjątku.
// uruchom program i zaobserwuj jaki wyjątek został rzucony,
// dodaj do kodu obsługę odpowiedniego wyjątku i
// uruchom ponownie program,
// zwróć uwagę czy jest to wyjątek kontrolowany,
// czy niekontrolowany i dlaczego.

package pl.coderslab.exceptions;

public class Main02 {

    public static void main(String[] args) {
        int[] tab = {  5, 1, 6, 7, 8 } ;
        try{
            System.out.println(tab[48]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Wyjątek dotyczący indeksu " +
                            "znajdującego się poza granicami tablicy");
            e.printStackTrace();
        }
    }
}
