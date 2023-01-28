package Gun36.A03_Interface;

import Gun29.A03Protected.Bir.Doctor;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz();// cember cizildi




        Dikdortgen d=new Dikdortgen();
        d.ciz();// dikdortgen cizildi

        //interface lerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir c2=new Cember();
        c2.ciz(); // çember çizildi
        // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişeniirsin


        cizdirme(c);
        cizdirme(d);



    }
    public  static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }
}
