package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A02_ArrayListTekElemlariAyirin {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.
        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Sayi= ");
            dizi[i]=scan.nextInt();
            
        }
        System.out.println("dizi= "+ Arrays.toString(dizi));

        ArrayList<Integer> tekler=new ArrayList<>();
        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i]%2 !=0){
                tekler.add(dizi[i]);
            }
            
        }
        System.out.println("tekler = " + tekler);

        //2. yontem
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Sayi= ");
            dizi[i]=scan.nextInt();

            if (dizi[i]%2 !=0)
                tekler.add(dizi[i]);

        }System.out.println("tekler = " + tekler);//oncekilerinide ekliyor




    }
}
