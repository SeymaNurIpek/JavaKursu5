package Gun28.Constructor1;

public class Ornek {
    public static void main(String[] args) {
// Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        //3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Book b1=new Book();
        b1.name="Calikusu";
        b1.publisYear=1925;
        b1.author="ResatNuri Gultekin";

        Book b2=new Book("Yaban",1926,"Yakup Kadri");


        Book b3=new Book("Kiralik Konak",1921);
        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);


    }
}
