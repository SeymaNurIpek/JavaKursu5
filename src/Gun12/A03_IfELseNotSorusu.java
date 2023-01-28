package Gun12;

import java.util.Scanner;

public class A03_IfELseNotSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dersinizi ve notunuzu aralarinda bir bosluk bularak giriniz");
        String dersNot=scan.nextLine();

        //1.yol
        int ind=dersNot.indexOf(":");
        int not=Integer.parseInt(dersNot.substring((ind+1)));
        //2. yol
        //int not1=Integer.parseInt(dersNot.replaceAll("\\D",""));

        if (not>100 || not<0){
            System.out.println("girdiginiz not degeri degil");
        } else if (not>=90) {
            System.out.println("Notunuz= A");

        } else if (not>=80) {
            System.out.println("Notunuz= B");

        } else if (not>=70) {
            System.out.println("Notunuz= C");

        }
        else if (not>=60) {
            System.out.println("Notunuz= D");

        }else if (not>=40) {
            System.out.println("Notunuz= E");

        }else {
            System.out.println("Notunuz= F");
        }
    }
}
