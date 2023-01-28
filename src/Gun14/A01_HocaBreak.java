package Gun14;

import java.util.Scanner;

public class A01_HocaBreak {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz" );
        int sayi= scan.nextInt();
        int sayac=0;
        int arananRakam=0;
        //2. yontem
        //boolean bulundu=false;
        // 5 girildi , 5`e kadar sayilari 1,2,3,4

        while (sayac<sayi){
           // System.out.println("sayac= "+sayac);

            if (sayac*sayac==sayi){// 0*0==9  1*1==9  2*2==9  3*3=9

                System.out.println("Tam Karedir");
                break;//calistiginda donguden cikar
            }

            // bunu yazdirdigimizda nereye kadar oldugunu gosterir.
            sayac++;
        } if (arananRakam==0)
            //(if in icine)(bulundu==false)// 2. yontem
            System.out.println("Tam kare degil");
    }}

