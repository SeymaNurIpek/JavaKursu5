package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class A03_HAshSet {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("red");
        renkler.add("green");
        renkler.add("Blue");
        renkler.add("red");
        renkler.add("RED");
        
        // ekrana yazdirma
        System.out.println("renkler = " + renkler);
        
        // Ekrana tek tek nasil yazdiririm
        for (String eleman:renkler) {// sira garanti degil
            System.out.println("eleman = " + eleman);
            
        }// foreach ile ilgili ornek olsun diye eklendi HAshSetle alakasi yok
//        int[] dizi={34,2,5,7,9,1,6,8};
//        for (int sayi:dizi) {
//            System.out.println("sayi = " + sayi);

       // }

        Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext()){
            System.out.println("gosterdigi eleman = " + gosterge.next());
            // .Next gostergenin gosterdigi elamani temsil eder
        }
        
        
    }
}
