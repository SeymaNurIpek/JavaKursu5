package Gun39.Soru3;

public class AbMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj);//a.mesaj = A`dan Merhaba

        B b=new B();
        System.out.println("b.mesaj = " + b.mesaj);//b.mesaj = B`den merhaba

        A a1=new A();
        System.out.println("a1 = " + a1.mesaj);//a1 = A`dan Merhaba
    }
}
