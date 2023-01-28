package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        /*
        equals: 2 String`in birbirlerine esit olmadigini kontrol eder
        sonuc BOOLEAN
         */
        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi: "+esitMi);// Merhaba ile MERHABA false

        System.out.println("s1.equals(s2): "+s1.equals(s2));//  Merhaba ile MERHABA false

        System.out.println("s1.equals(Merhaba): "+s1.equals("Merhaba"));// Merhaba ile Merhaba true

        System.out.println(s2.equals(s1));//false



    }
}
