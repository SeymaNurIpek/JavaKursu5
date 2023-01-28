package AhmetHoca.BirinciHafta;

import java.util.Scanner;

public class Odev2_1 {
    public static void main(String[] args) {
        // kullanicidan bir not girmesini isteyen ve bu nota
        // karsilik gelen harf notunu veren programi yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not=scan.nextInt();

        if (not<0 || not>100){System.out.println("girdiginiz not degeri degil");
        } else if (not<45) {System.out.println("F");
        } else if (not<55) {System.out.println("D");
        } else if (not<70) {System.out.println("C");
        } else if (not<85) {System.out.println("B");
        } else if (not<=100) {System.out.println("A");}
    }
}
