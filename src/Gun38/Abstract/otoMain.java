package Gun38.Abstract;

public class otoMain {
    public static void main(String[] args) {
        Ford fr=new Ford("mustang",1995,4);//ford normal class ve nesne olusturulabilir,
        System.out.println(fr.HizlanmaSuresi());
        // yani new yapilabilir

        //Interface lerden Nesne olusturulamaz sadece Referans tip olabilirler
        // ayni sekilde ABSTRACT lardan da nene olusturulamaz,sadece Referans olabililer
    }
}
