package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {
        String namen = "Agnieszka";
        String nicknamen = "Czapla";
        String surnamen = "Doberska";
        String result = createName(namen,nicknamen,surnamen);
        // albo
        System.out.println(createName( "Ania", "Hiacynt","Kowalska"));
        // albo
        System.out.println(result);
        System.out.println(utwórzNazwę("Alexandra ","Mazliah-","Doberska"));
        System.out.println(utwórzImię("Prze", "my","sław"));
    }
    public static String createName (String name,String nickname,String surname){
        return name + " "  + nickname + " " + surname;
    }
    public static String utwórzNazwę(String name,String surname, String nickname){
        return String.join("",name,surname,nickname);
    }
    public static String utwórzImię(String a, String b, String c){

        return a + b + c;
    }
}
