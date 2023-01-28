package Gun32.A02_;

import java.util.Scanner;

public class ArabaMain {
    public static void main(String[] args) {
        // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
        // CalculatorMain de 1 tane nesne oluşturup bunu kontrol ediniz.
        //
        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

        Scanner scan=new Scanner(System.in);
        System.out.println("Model giriniz");
        Araba a1=new Araba();
        a1.setModel(scan.nextInt());
        a1.setModel(2022);
        a1.setKapiSayisi(5);
        a1.setRenk("Mavi");
        a1.setMotorHacmi(1600);
        System.out.println("a1 = " + a1);

        Araba a2=new Araba("Pembe",2030,1600,4);
        System.out.println("a2 = " + a2);
         int arabaModeli=a1.getModel();
        System.out.println("arabaModeli = " + arabaModeli);



    }


}
