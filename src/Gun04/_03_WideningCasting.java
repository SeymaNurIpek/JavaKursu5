package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        //byte->short->int->long->float->double

        int sayi=9;
        long toplam=6700;
        double oran=3.2;

        oran=sayi;//oran=9
        System.out.println("oran= "+oran);

        toplam=sayi;//toplam=9
        System.out.println("toplam= "+toplam);

        oran=toplam; //oran=9
        System.out.println("oran= "+oran);

    }
}
