package Gun13;

import java.util.Scanner;

public class A08_HocaCevap {
    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner oku=new Scanner(System.in);
                String okunan="";

                do{
                    System.out.print("ifade giriniz=");
                    okunan=oku.next();

                    System.out.println("program çalışıyor");

                }while(!okunan.equalsIgnoreCase("x"));

                System.out.println("program bitti");


            }
}
