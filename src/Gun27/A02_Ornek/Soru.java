package Gun27.A02_Ornek;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.


        int max=MyMath.getMax(6,3);
         int min=MyMath.getMin(6,3);
         int rnd=MyMath.getRandom(10);
         double usSonuc=MyMath.getUsAl(2,3);
         double kareKok=MyMath.getKarekok(16);


        System.out.println("min = " + min);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("kareKok = " + kareKok);

    }
}
