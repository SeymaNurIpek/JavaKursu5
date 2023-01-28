package AhmetHoca.BesinciHafta;

import java.util.Arrays;

public class Hafta5_05 {
    public static void main(String[] args) {
        // Ornek 2: Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};

        System.out.println(Arrays.toString(ch));
        String metin="";
        for (int i = 0; i < ch.length; i++) {
            metin+=ch[i];


        }System.out.println(metin.substring(0));// bu olmasada olur
        System.out.println("metin = " + metin);
        //2. yontem
        String  str=new String(ch);
        System.out.println("str = " + str);
        
        //3. yontem
        String str2=String.valueOf(ch);
        System.out.println("str2 = " + str2);

    }
}
