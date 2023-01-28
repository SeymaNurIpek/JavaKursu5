package Gun28.Constructor3;

public class A {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.  
        
        
        Banka b1=new Banka();
        b1.adi="Ziraat";
        b1.kurulusYili=1861;
        b1.subeSayisi=500;
        
        Banka b2=new Banka("is",1000,1907);
        
        Banka b3=new Banka();
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}
