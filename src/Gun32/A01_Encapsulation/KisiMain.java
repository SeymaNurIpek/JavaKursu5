package Gun32.A01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi();
       // kisi1.ad="Seyma Nur";
       // kisi1.soyisim="Ipek";
        // kisi1.yas=-25;private calismaz
        kisi1.setAd("Seyma Nur");
        kisi1.setSoyad("Ipek");
        kisi1.yasAta(-25);
        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyAd());
        System.out.println("kisi1 = " + kisi1);


        /*
        degiskene erisimi direk kapatip
        bir method ile korumali veri gonderme ve alma
        islemine: Encapsulation denir
         */
    }
}
