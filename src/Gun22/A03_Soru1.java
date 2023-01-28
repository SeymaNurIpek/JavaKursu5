package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class A03_Soru1 {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizikNotlari=new ArrayList<>();
        ArrayList<Integer> kimyaNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(50);
        matNotlari.add(50);

        fizikNotlari.add(30);
        fizikNotlari.add(40);

        kimyaNotlari.add(60);
        kimyaNotlari.add(70);
        kimyaNotlari.add(80);
        kimyaNotlari.add(90);

        //@ boyutlu ArrrayList olmasi icin
     ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        System.out.println("notlarListesi = " + notlarListesi);
        notlarListesi.add(fizikNotlari);
        System.out.println("notlarListesi = " + notlarListesi);
        notlarListesi.add(kimyaNotlari);
        System.out.println("notlarListesi = " + notlarListesi);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {//her bie derslerin tum notlari
            System.out.print(dersler.get(i)+" : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {// tek tek botlar
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }
        System.out.println("**************************");
        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Ders No (0-Mat, 1-Fiz, 2-Kim)= ");
        int dersNo=scan.nextInt();
        dersNotlariniYazdir(notlarListesi, dersNo);
        System.out.println();

        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.
        derOrtVeGecenMikBul(notlarListesi, dersNo);
        

    }public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){
      
        for (int i = 0; i < notlarListesi.get(dersNo).size() ; i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");
            
        }
    }public static void derOrtVeGecenMikBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){
        int toplam=0;
       
       
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);
            
            
        }int ortalama=toplam/notlarListesi.get(dersNo).size();
        int gecenSayisi=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>=ortalama)
                gecenSayisi++;
            
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("gecenSayisi = " + gecenSayisi);
        
   
    }
    
}
