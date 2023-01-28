package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class A03_NotEvetHayir {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner scanStr=new Scanner(System.in);//string icin
        Scanner scanInt=new Scanner(System.in);//Integer icin

        ArrayList<Integer> notlar=new ArrayList<>();
        int toplam=0;
        String devamMi;
        
        do {//notu girecek
            System.out.println("not= ");
            int not=scanInt.nextInt();
            //notlari arrayliste at
            notlar.add(not);
            //girilen notlari topla
            toplam+=not;
            //devam etmek istiyor musunuz
            System.out.println("Devam etmek istiyor musunuz(E/H)");
            devamMi=scanStr.nextLine();
        }while(devamMi.equalsIgnoreCase("E"));
        //ortalamayi bul
        int ort=toplam/ notlar.size();
        System.out.println("ort = " + ort);
        
        //gecen sayisini bul
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size() ; i++) {
            if (notlar.get(i)>ort)
                gecenSayisi++;
            
        }
        System.out.println("gecenSayisi = " + gecenSayisi);

    }
}
