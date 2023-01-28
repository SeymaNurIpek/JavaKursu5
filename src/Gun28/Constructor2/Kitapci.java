package Gun28.Constructor2;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        //3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

         Kitap b1=new Kitap("Kiralik Konak", 1921);
        b1.name="Calikusu";
        b1.publisYear=1925;
        b1.author="ResatNuri Gultekin";

        Kitap  b2=new Kitap("Yaban",1926,"Yakup Kadri");


        Kitap b3=new Kitap("Kiralik Konak",1921);
        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);



    }
}
