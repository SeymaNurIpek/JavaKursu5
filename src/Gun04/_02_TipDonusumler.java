package Gun04;

public class _02_TipDonusumler {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam=ogrNot1;//byte -> int atinca problem cikarmadi(Genisletme -Widening Casting)
        //cunku byte icin hafizada ayrilan alan zaten int`a sigar sigdigi icin kabul eder
        // cunku veri kaybi olma ihtimali yok

        //ogrNot1=toplam;
        /*
        burda kabul etmiyor buyukten kucuge atma islemi var(Daraltma --Narrow Casting)
        veri kaybi olma ihtimali var bu yuzden asagidaki gibi yapabiliriz
         */
        ogrNot1=(byte) toplam;


    }
}
