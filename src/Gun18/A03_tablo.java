package Gun18;

public class A03_tablo {
    public static void main(String[] args) {
        int[] dizi=new int[10];//bos default 0 olan
        int[] dizi2={2,3,4,5,6,7,67,77};

        int[][] tablo=new int[2][3]; //2 satir row, 3 sutun column
         // bos default deger 0  2*3 kadar 6 adet sayi

        int[][] tablo2={
                {2,3,4  },//0. satir
                {34,45,5} //1. satir
        };

        for (int i = 0; i <2 ; i++) {
            System.out.print(tablo2[i][0]+" ");
            System.out.print(tablo2[i][1]+" ");
            System.out.print(tablo2[i][2]+" ");

            System.out.println();

        }
        System.out.println();
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablo2[i][j]+ " ");

            }
            System.out.println();

        }
    }
}
