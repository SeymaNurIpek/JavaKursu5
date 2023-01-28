package Gun35.A02_Polymormphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("Karabas");
             kopek1.ses();
             kopek1.kokladi();

            Kedi kedi1=new Kedi("Kopuk");
           kedi1.ses();
           kedi1.tirmaladi();

           kopekSesi(kopek1);
           kediSesi(kedi1);
        System.out.println("**********");
           hayvanSesi(kopek1);
           hayvanSesi(kedi1);
        System.out.println("********");

        // Referans tipi// nesne tipi
        Hayvan hayvan1=new Hayvan("ordek");// hayvanlardan bir hayvan
        Hayvan hayvan2=new Kopek("Kangal");//Hayvanlardan bir kopek
        Hayvan hayvan3=new Kedi("boncuk");//Hayvanlardan 1 kedi

        System.out.println("----------------");
        hayvan1.ses();// genel hayvan oldugu icin ses cikardi olur
        hayvan2.ses();//kopek hayvan oldugu icin  havladi
        hayvan3.ses();// kedi hayvani  miyavladi
        System.out.println("******");
        hayvan2.ses();// kopekde olsa hayvan Referansi sebebiyle mothodlar kisitli
        ((Kopek)hayvan2).kokladi();// tip donusumu yaptik
       // ((int)Math.random()) gibi tip donusumu

        //Setlerden HasSet
        //Maphlerden HashMap
        //Listlerden Arraylist

        //        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.


    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }
    public static void hayvanSesi(Hayvan hayvan){
      // Buraya hem kedi geliyor hemde kopek geliyor
        hayvan.ses();
        // kimin geldigini soruyoruz
        //bir classin kim oldugunu bulma yontemi
        if (hayvan instanceof Kopek)// hayvan aslinda Kopek mi
            ((Kopek)hayvan).kokladi();
        if (hayvan instanceof Kedi)// hayvan alinda Kedi mi
            ((Kedi)hayvan).tirmaladi();
    }

}
