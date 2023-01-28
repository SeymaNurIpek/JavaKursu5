package DavutHoca;

import java.util.Scanner;

public class AtmSorusu {
    public static void main(String[] args) {
        /*
        Bugün için küçük bir banka ATM Projesine baslayalim.
Ilk olarak bugün Kullanici girişi kismini ve Menüleri yapalim. Ve bunlari bugüne kadar öğrendiklerimizle yapacagiz.
Giris kismi :
ATM ye gelen kişiyi Hosgeldiniz Mesaji ve Sifrenizi Giriniz gibi bir mesaj karsilasin
•    Eger doğru sifre girerse asagidaki gibi Menu ciksin karsisina ve secim yapsin. Secimi yaptıktan sonra ise sadece bir mesaj versin şimdilik. (mesaji her menü seciminde  yazsin ekrana)
Ornegin 2 tusuna bastigi zaman “2.Para Cekme Menüsündesiniz” gibi

1 Kendi Hesabina Para yatirma
2.Para Cekme
3.Havale
4.Sifre Degistirme
5.Cikis
•    Eger Hatali girer ise 3 kere giriş hakki olsun ve
4. Giriş yaptigi zaman “ Üzgunum Cok sayida hatali giriş yaptiginiz için Kartiniza El konulmuştur Lütfen Subemizden geri aliniz”   mesajini göstersin ve ciksin.
o    Her sifre girişinde ekranda kacinci girişi olduguda yazsin (düzenlendi)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("SETBank ATM`ye Hosgeldiniz");

        int sifre;
        int girisSayisi=0;
        int menuSecim;
        int tanimliSifre=12345;
        do {
            System.out.println("Lutfen Sifrenizi giriniz");
            sifre=scan.nextInt();


            if (sifre!=tanimliSifre){
                System.out.println("Hatali sifre girdiniz lutfen sifreniz tekrar giriniz");
                girisSayisi++;
                System.out.println("girisDenemeniz= "+girisSayisi);

            }
        }while (sifre!=tanimliSifre && girisSayisi<=3);

        if (sifre==tanimliSifre){
            System.out.println("Lutfen islem yapmak isteginiz menuyu secin: \n " +
                    "1. Kendi hesabima para yatirma \n " +
                    "2. Para Cekme\n " +
                    "3. Havale\n " +
                    "4. SifreDegistirme\n " +
                    "5. Cikis" );
            menuSecim=scan.nextInt();
            switch (menuSecim){
                case 1: System.out.println("Kendi hesabima para yatirma menusundesiniz");break;
                case 2: System.out.println("Para Cekme menusundesiniz");break;
                case 3: System.out.println("3.Havale Menüsündesiniz.");break;
                case 4: System.out.println("4.Şifre Değiştirme Menüsündesiniz.");break;
                case 5: System.out.println("5.Çıkış Menüsündesiniz.");break;
                default: System.out.println("Hatalı giriş yaptınız.");
            }
        }else {
            System.out.println(girisSayisi+". sifreniz\n" +
                    "uzgunum  cok sayida hatali giris yaptiniz kartiniza el konulmustur\n" +
                    "kartinizi subemizden alabilirsiniz.");
        }


    }
}
