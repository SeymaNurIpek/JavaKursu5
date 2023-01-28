package Gun34.A01_;

public class AracPark {
    // 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
    // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
    // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
    //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.
    public static void main(String[] args) {
        Otobus otobus=new Otobus("Mavi","BMW",3500,100);
        System.out.println("otobus = " + otobus);
        System.out.println(otobus.getRenk());
        otobus.setRenk("Kirmizi");
        System.out.println("otobus.getRenk() = " + otobus.getRenk());
        System.out.println("otobus = " + otobus);

    }
}
