package Gun20;

import java.util.Scanner;

public class A03_Faktoriyel {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(faktoriyel(sayi));

        int faktoriyel=faktoriyel(sayi);
        System.out.println("faktoriyel= "+faktoriyel);
        if (faktoriyel%2==0)
            System.out.println("Cift");
        else
            System.out.println("tek");

    }public static int faktoriyel(int sayi){

        int faktoriyel=1;
        for (int i = 1; i <sayi; i++) {
            faktoriyel*=i;
        }
        return faktoriyel;
    }
}
