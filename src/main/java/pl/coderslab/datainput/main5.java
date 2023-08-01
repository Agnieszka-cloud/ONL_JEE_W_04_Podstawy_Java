package pl.coderslab.datainput;

import java.util.Scanner;

public class main5 {
    public static void main (String[]args ){
        textLines();
    }

    public static void textLines(){
        Scanner scan = new Scanner(System.in);
        String quit_command = "quit", temp = "";
        boolean quit_checker = false;
        StringBuilder sb = new StringBuilder();
        System.out.println("Podaj tekst");
        while (!quit_checker){
            temp = scan.nextLine();
            if (temp.equals(quit_command)){
                quit_checker = true;
            } else {
                sb.append(temp + "\n");
            }
        }
        System.out.println(sb.toString());
    }
}
