package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.



        Musteri mus1=new Musteri();
        mus1.musteriNo=1;
        mus1.ad="Seyma";
        mus1.soyad="Ipek";

        mus1.musterihesap.parayatir(100);
        mus1.musterihesap.parayatir(200);
        mus1.musterihesap.paraCek(50);
        System.out.println(mus1.musterihesap);


    }
}
