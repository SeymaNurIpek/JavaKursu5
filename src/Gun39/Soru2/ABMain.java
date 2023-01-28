package Gun39.Soru2;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);//A static oldugu icin bir tane masaj verir
        //A.mesaj = a`dan Merhaba

        B b=new B();
        System.out.println("A.mesaj = " + A.mesaj);//A.mesaj = B`den Merhaba
        
        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj);//A.mesaj = B`den Merhaba
        
    }
}
