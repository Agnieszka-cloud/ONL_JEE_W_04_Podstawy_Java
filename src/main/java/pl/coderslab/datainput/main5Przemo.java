package pl.coderslab.datainput;

import java.util.Scanner;

public class main55 {
    public static void main(String[]args){
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if(line.equals("quit")){
                break;
            }
            result.append(line + "\n");
        }
        System.out.println(result);
    }
}
