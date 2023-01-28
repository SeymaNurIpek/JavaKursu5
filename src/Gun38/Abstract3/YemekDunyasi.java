package Gun38.Abstract3;

public class YemekDunyasi {
    public static void main(String[] args) {
        System.out.println("***** Yemek Dunyasi`na Hosgeldiz *****");
        Baklava b=new Baklava();
        b.setName("Baklava");

        b.madeln();
        b.taste();

        System.out.println("Muhtesem");
        System.out.println("*******");
        CheeseCake c=new CheeseCake();
        c.madeln();
        c.taste();
        System.out.println("*******");
        GreekSalad g=new GreekSalad();
        g.madeln();
        g.taste();
        System.out.println("*******");
        SezarSalad s=new SezarSalad();
        s.setName("Sezar Salatasi ");
        s.madeln();
        s.taste();
    }
}
