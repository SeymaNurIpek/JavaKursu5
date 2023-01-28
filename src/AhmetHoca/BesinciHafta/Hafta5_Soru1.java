package AhmetHoca.BesinciHafta;

import java.util.Arrays;

public class Hafta5_Soru1 {
    public static void main(String[] args) {
        //TODO 4*4 bir int array tanimlayiniz ve random doldurup ekrana yazdiriniz 0 den 10'a kadar(10 dahil)?
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 11);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
