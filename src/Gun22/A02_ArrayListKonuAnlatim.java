package Gun22;

import java.util.ArrayList;

public class A02_ArrayListKonuAnlatim {
    public static void main(String[] args) {
        int sayi = 5; // tek bir rakam tutabilen bir değişken
        int[] dizi = new int[20]; // 20 adet sayı saklayabilen bir değişken, uzunluğu sabit
        int[][] tablo=new int[20][2]; // 20x2 lik sayı saklayabilen değişken, sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>(); // istenildiği kadar sayı eklenebilen, uzunluğu değişken
        /****************************/

        // bir sınıf bu sınıf da 20 kişi var ve bunların 3 dersi olsun.Öğrencilerin bu 3 derse ait notlarını
        // nasıl bir değişkende saklayabilirim.
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

        //2 boyutlu ArrrayList olmasi icin
        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        System.out.println("notlarListesi = " + notlarListesi);
        notlarListesi.add(fizikNotlari);
        System.out.println("notlarListesi = " + notlarListesi);
        notlarListesi.add(kimyaNotlari);
        System.out.println("notlarListesi = " + notlarListesi);

        notlarListesi.get(0);//-> mat notlari

        int matBirNot=notlarListesi.get(0).get(0);//mat notlarinin ilk notu
        System.out.println("matBirNot = " + matBirNot);

        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0));//mat norlari
        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(1));//fizik notlari
        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(2));//kimya notlari

        // yukaridakilarin yerine bir for dongusu nasil kullaniriz
        for (int i = 0; i < notlarListesi.size(); i++) {//0,1,2
            System.out.println("notlarListesi = " + notlarListesi);
        }

        for (int i = 0; i <notlarListesi.size();  i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j)+"\t");

            }
            System.out.println();
        }





    }


}
