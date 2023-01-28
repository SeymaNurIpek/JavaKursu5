package Gun10;

import java.util.Scanner;

public class A02_Vize {
    public static void main(String[] args) {
        /*
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.
         */
        Scanner oku=new Scanner(System.in);
        System.out.print("vize notu=");
        double vize= oku.nextInt();
        System.out.println("final notu= ");
        double final1=oku.nextDouble();

        double ortalama=((vize*0.5)+(final1*0.5))/2;


        if (ortalama>=60){
            System.out.println("gectiniz");
            System.out.println("Tebrikler");
        } else {
            System.out.println("butnlemeye kaldiniz ");
        }
    }
}
