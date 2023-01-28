package Gun04;

public class _04_NarrowingCastingDaraltma {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi=(int) oran;
        /*
        burda buyukten kucuge gittigimiz icin challenger patladi bu yuzden (int) yazmak zorunda kaldik
         */

        System.out.println("sayi= "+sayi);
        //int tam sayi oldugundan tam kismini aliyor yani 3`u

        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre= (byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        /*
        sen esitligin sag tarafinda rakamlar toplandi , toplam INT durumunda
        byte cevre=5+7+5+7; int`i-> byte atamaya calisiyorsun
        eger veri kaybi olmayacagindan eminsen (byte) yaz
         */

        System.out.println("cevre="+cevre);
        int cevre2=kisaKenar+uzunKenar+kisaKenar+uzunKenar;
        System.out.println("cevre2= "+cevre2);
    }
}
