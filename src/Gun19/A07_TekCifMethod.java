package Gun19;

import java.util.Scanner;

public class A07_TekCifMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);

        //Kullanicidan sayi alarak onu tek mi cift mi yazdiralim
        tekMiCiftMiOku();

    }

    public static void tekMiCiftMi(int sayi){
        if(sayi%2!=0)
            System.out.println("tek");
        else
            System.out.println("cift");
    }


    public static void tekMiCiftMiOku(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz= ");
        int sayi= scan.nextInt();

        tekMiCiftMi(sayi);
    }
}
