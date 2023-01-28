package Gun18;

import java.util.Scanner;

public class A05_EnBuyukSayii {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.
        Scanner scan=new Scanner(System.in);
        int[][] tablo=new int[2][3];

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print("sayi giriniz");
                tablo[i][j]=scan.nextInt();

            }

        }
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();
        }
        int enb=tablo[0][0];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (tablo[i][j]>enb)
                    enb=tablo[i][j];


            }

        }
        System.out.println("enb= "+enb);

    }
}
