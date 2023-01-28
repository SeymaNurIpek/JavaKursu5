package Gun43;

import java.util.Scanner;

public class A06_ThrowExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");

        System.out.print("Yeni sifreniz= ");
        String newPassword= scan.nextLine();

        if (newPassword.length()<8){
            System.out.println("Lutfen Dikkat ! ");
            System.out.println("Sifreniz en az 8 karakterden olusmali");
            // log tutma
        }
        if (newPassword.length()>15){
            System.out.println("Lutfen Dikkat ! ");
            System.out.println("Sifreniz en fazla 15 karakterden olusmali");
          // log tutma
        }

    }
}
