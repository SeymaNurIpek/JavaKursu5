package Gun21;

import java.util.ArrayList;

public class A01_ArrayListKonuAnlatimNotlar {
    public static void main(String[] args) {
        //dizi ,array: boyut sayisi belli, sonradan degistirilemez
        int[] dizi= new int[5];//Array 5 elemanli boyutu sonradan degistirilemiyor
        
        /*
        Boyutu dinamik olsun,ekledikce uzasin , sildikce kisalsin
        ArrayList: Boyutu basta vermeye bile gerek yok , boyutu baslangicta 0 eleman arttikca artar,
        sildikce kisalir
         */
        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String>  stringList=new ArrayList<>();
        ArrayList<Double>  doubleList=new ArrayList<>();
        
        ArrayList<String> isimler =new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet");//uzunluk 1
        isimler.add("Metin");//uzunluk 2
        isimler.add("Hacer");//uzunluk 3
        isimler.add("Aynur");//uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(2,"Muhanmed");
        // Verilen index`e ekliyor , digerleri 1 kayiyor sona dogru
        System.out.println("isimler = " + isimler);
        
        isimler.set(3,"Seyma");//rakam verildiginde verilen indez`deki elemanlani silip onun yerine yaziyor
        System.out.println("isimler = " + isimler);


        boolean varMi=isimler.contains("Metin");//var mi
        System.out.println("varMi = " + varMi);
        System.out.println(isimler.contains("Metin"));

        isimler.remove("Metin");// degere gore siler
        System.out.println("isimler = " + isimler);
        
        isimler.remove(1);//o index dekini siler
        System.out.println("isimler = " + isimler);
        
        int indexOfAynur=isimler.indexOf("Aynur");
        System.out.println("indexOfAynur = " + indexOfAynur);

        String ilkEleman=isimler.get(0);// verilen indexdeki degeri verir 
        System.out.println("ilkEleman = " + ilkEleman);
        
        isimler .clear();//her seyi temizler
        System.out.println("isimler = " + isimler);
        

    }
}
