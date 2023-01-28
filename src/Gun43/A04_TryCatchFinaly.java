package Gun43;

public class A04_TryCatchFinaly {
    public static void main(String[] args) {

        long startTime=0;
        String str="";
        try {startTime=System.currentTimeMillis();
            System.out.println("Hatadan onceki kisim");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonrakii kisim");
            // hata olma olasiliginin oldugu kodlar
        }catch (Exception ex)
        {
            System.out.println("catch blogu calisti");
            // hata oldugunda yapilacaklar
        }
        finally// // hata olsada calisir olmasada calisacak kisim, bu bolum yukaridaki surecle
                // olgugunu gostermek icin finalyy icin yazilir
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch blogu ilgili son yapilacaklar");

        }
        System.out.println("diger calisan kodlar " );
        System.out.println(" program sonu");
    }
}
