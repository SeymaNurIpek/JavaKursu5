package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A01_ArrayListKonuAnlatim {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.
       

                ArrayList<Integer> sayilar= new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //Siralam islemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Tersine Cevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);
        
        //Max ve Min eleman bulma
        System.out.println("Max()= "+Collections.max(sayilar));
        System.out.println("Min()= "+Collections.min(sayilar));
        
        //replace
        Collections.replaceAll(sayilar,5,15);//0`lara 5 atadi
        System.out.println("sayilar = " + sayilar);
        // tanimlarken deger atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6));
        System.out.println("liste = " + liste);
        ArrayList<String>  strListe=new ArrayList<>(Arrays.asList("ahmet","Mehmet","Busra","romam"));
        System.out.println("strListe = " + strListe);

        ArrayList<Integer> liste2=new ArrayList<>();
        Collections.addAll(liste2 ,2,3,4,5,6,67);
        System.out.println("liste2 = " + liste2);

        //diziyi direk Arraylist`e nasil atarim
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);

    }
}
