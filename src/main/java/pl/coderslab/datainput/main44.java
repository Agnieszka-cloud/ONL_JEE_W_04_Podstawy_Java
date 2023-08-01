/*
123.1235
*/
package pl.coderslab.datainput;
import java.util.Formatter;
public class main44 {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        // Format 4 decimal places.
        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        System.out.println(String.format("%.4f", (float) 6 / (2+1)));
    }
}

