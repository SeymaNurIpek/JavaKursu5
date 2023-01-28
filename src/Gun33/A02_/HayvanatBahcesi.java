package Gun33.A02_;

public class HayvanatBahcesi {
    //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.(ses cikardi)


    public static void main(String[] args) {
        Kopek kopek1=new Kopek("beyaz",50,"Kangal");
        kopek1.konustu();
        Kedi kedi1=new Kedi("beyaz",3,"Van");
        kedi1.konustu();
        Yilan yilan1=new Yilan("siyah",30,"piton",3);
        yilan1.konustu();
        Ordek ordek1=new Ordek("beyaz",2,"govel",0.5);
        ordek1.konustu();
    }

}
