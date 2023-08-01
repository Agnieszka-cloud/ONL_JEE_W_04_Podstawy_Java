//W pliku `Main05.java` została umieszczona metoda o sygnaturze:
//
//        `public static String stringFromArray(String[] str)`.
//
//        Uzupełnij ciało metody tak, aby zwracała napis powstały
//        z połączenia wszystkich napisów występujących w tablicy `str`.
//

package pl.coderslab.strings;

public class Main05 {

    public static void main(String[] args) {
        System.out.println(stringFromArr(new String[]{"kot","pies","rybki"}));
        System.out.println(stringFromArrays(new String[]{"kot","pies","rybki"}));
        System.out.println(stringFromArray(new String[]{"Ola","Zoe","Aga"}));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("iteration: ").append(i).append('\n');
        }
        System.out.println(sb.toString());
    }
    public static String stringFromArr(String[] str){
        return String.join(",",str);
    }
    public static String stringFromArrays (String [] str){
        String połączony = "";
        for (int i = 0; i < str.length ; i++) {
            połączony = połączony + str[i] + ",";
        }
        return połączony;
    }
    static String stringFromArray(String[] str){
        String joined = "";
        for( int i = 0; i < str.length; i++){
            joined = joined + str[i] + ", " ;
        }
        return joined;
    }
}
