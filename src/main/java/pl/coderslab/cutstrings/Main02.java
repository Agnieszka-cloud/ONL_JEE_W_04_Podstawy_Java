/*W pliku `Main02.java` znajduje się zmienna `str`.
Napisz program, który:

        1. podzieli podany ciąg znaków na bohaterów z filmu
        `Powrót do przyszłości` – znakiem podziału jest przecinek `(,)`,
        2. wyświetli na konsoli każdego bohatera w oddzielnej linii.*/

package pl.coderslab.cutstrings;

public class Main02 {

    public static void main(String[] args) {

        String str = "Einstein,Red The Bum,Stella Baines," +
                "Lorraine Baines,Joey Baines,Milton Baines,3-D," +
                "Jennifer Parker,Mark Dixon,Linda McFly,Match," +
                "Lou,Goldie Wilson,Dr. Emmett Brown,Skinhead," +
                "Biff Tannen,Marty McFly," +
                "Mr. Peabody,Marvin Berry,George McFly,Sam Baines,Mr. " +
                "Strickland,Sally Baines,Dave McFly";

        String[]array = str.split(",");
        for( String hero : array ){
            System.out.println(hero);
        }
    }
}
