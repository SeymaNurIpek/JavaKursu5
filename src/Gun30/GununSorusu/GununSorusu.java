package Gun30.GununSorusu;

public class GununSorusu {
    int a;
    static int b=0;

    void artir(){
        a++;
        b++;
    }



    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;
        
        GununSorusu gs2=new GununSorusu();
        gs2.a=7;
        
        // a kac
        // burda a`nin degeri kac oldu su anda : gs1`nin asi 5
        // gs2 `nin b si 7
        // b kac

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);

        gs1.artir();
        gs2.artir();
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("gs1.a = " + gs1.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);
        
        
        
    }
}
