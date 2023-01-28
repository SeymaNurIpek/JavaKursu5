package Gun43;

import java.util.Scanner;

public class A06_ThrowExample2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");

        System.out.print("Yeni sifreniz= ");
        String newPassword= scan.nextLine();
        try {
            if (newPassword.length()<8) {
                System.out.println("Sifreniz en az 8 karakterden olusmali");

            }
            if (newPassword.length()>15) {
                System.out.println("Sifreniz en fazla 15 karakterden olusmali");
            }
        }catch (Exception ex){

            /*
            Hatalar bir yere toplanip , hepsi icin yapilmasi gereken islemler
            birarada burada yapilabilir. mesala log tutma gibi
             */
           System.out.println("Lutfen Dikkat ! ");
            System.out.println(ex.getMessage());
            // log tutma
        }
    }
}
