package Odevler.Odev1;

public class CatsMain {
    public static void main(String[] args) {
        System.out.println("**** Kediler Dunyasina Hosgeldiniz *****");
       Tiger t=new Tiger();
       t.walk();
       t.talk();
        System.out.println("********");

       Lions l=new Lions();
       l.talk();
       l.walk();
        System.out.println("*******");

       HomeCats h=new HomeCats();
       h.talk();
       h.walk();

    }
}
