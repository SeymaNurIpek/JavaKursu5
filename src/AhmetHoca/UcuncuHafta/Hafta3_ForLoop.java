package AhmetHoca.UcuncuHafta;

public class Hafta3_ForLoop {
    public static void main(String[] args) {
        /*
        100`e kadar olan cift sayilari yazdiriniz
         */
        for (int i = 0; i <=100; i+=2) {
            System.out.print(i+ " ");

        }
        System.out.println();
        /*
        break=durdurur//arkasindan kod yazamazsin if icinde
       continue=pas gectirir
         */
        for (int i = 0; i <5 ; i++) {
            if (i==4){
                System.out.println(i);
                break;
            }

        }

        for (int i = 0; i <5; i++) {
            if (i==3){
                System.out.println(i);
                continue;
            }

        }


    }
}
