package Gun19;

public class A02_SutunSayisi {
    public static void main(String[] args) {

        int[][] tablo = {  //5 satir: 0,1,2,3,4
                {4, 55},  //0. satir
                {45, 6, 77},//1.ci satir
                {4, 2, 999, 45, 56, 66},//2.satir
                {42, 12, 9},//3.satir
                {4}//4.satir
        };

        System.out.println("Satir miktari= " + tablo.length);
        System.out.println("0. satirdaki sutun sayisi= " + tablo[0].length);
        System.out.println("1. satirdaki sutun sayisi= " + tablo[1].length);
        System.out.println("2. satirdaki sutun sayisi= " + tablo[2].length);
        System.out.println("3. satirdaki sutun sayisi= " + tablo[3].length);
        System.out.println("4. satirdaki sutun sayisi= " + tablo[4].length);

        //yazdirma bolumu
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");

            }
            System.out.println();
        }

    }
}
