package Gun19;

public class A01_TabloLength {
    public static void main(String[] args) {
        int[][] tablo1 = new int[2][3];    //2 satir 3 sutun           veya doldurmak isteseydik asagidaki gibi olurdu
        //veya boyle
        int[][] tablo = {  //deger vererek tanimladik
                {3, 4, 55},
                {234, 22, 33}
        };

        System.out.println("Satir uzunlugu= " + tablo.length);      //2 //satir sayisi
        System.out.println("0. Satirin sutun uzunlugu= " + tablo[0].length);//3, sutun uzunlugu
        System.out.println("1. Satirin sutun uzunlugu= " + tablo[1].length);//3


        for (int i = 0; i < tablo.length; i++) {  //satir uzunlugu

            for (int j = 0; j < tablo[i].length; j++) {  //ilgili satirdaki sutun uzunlugu
                System.out.print(tablo[i][j] + "\t");

            }
            System.out.println();
        }
    }
}