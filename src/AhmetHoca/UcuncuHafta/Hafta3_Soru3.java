package AhmetHoca.UcuncuHafta;

public class Hafta3_Soru3 {
    public static void main(String[] args) {
        /*
        merhaba dunya yi testen yazdirin
         */

        String cumle="Merhaba dunya";
        int cumleuzunluk=cumle.length();
        String tersCumle="";

        for (int i =cumleuzunluk-1; i >=0; i--) {
            tersCumle+=cumle.charAt(i);


        }
        System.out.println(tersCumle);

    }
}
