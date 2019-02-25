import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //cz1();
        //cz2();
        cz3();
    }
    public static void cz1(){
        int test;
        String pesel;
        Scanner in = new Scanner(System.in);
        System.out.println("podaj pesel: ");
        test = in.nextInt();
        pesel = Integer.toString(test);
        System.out.println("Twoj rok urodzenia to: "+pesel.charAt(0)+pesel.charAt(1));
    }
    public static void cz2(){
        String test2;
        int i;
        System.out.println("podaj haslo: ");
        Scanner in = new Scanner(System.in);
        test2 = in.nextLine();
        if(test2.equals("JAVA")){
            for(i=4; i>=0; i--){
                for(int a = i; a>0; a--){
                    System.out.print(test2.charAt(i-1));
                }
                System.out.print("\n");
            }
            for(i=0; i<4; i++){
             for(int a=0; a<=i; a++){
                    System.out.print(test2.charAt(i));
                }
             System.out.print("\n");
            }
        }
    }
    public static void cz3(){
        String imie;
        String nazwisko;
        int wiek;
        String miasto;
        Scanner in = new Scanner(System.in);
        System.out.println("Jak masz na imie? : ");
        imie = in.nextLine();
        System.out.println("Jak masz na nazwisko? : ");
        nazwisko = in.nextLine();
        System.out.println("W jakim mieście mieszkasz? : ");
        miasto = in.nextLine();
        System.out.println("Ile masz lat? : ");
        wiek = in.nextInt();
        System.out.println("A więc jestes "+imie+" "+nazwisko+", masz "+wiek+" lat i mieszkasz w "+miasto);
    }
}
