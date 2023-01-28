package Gun20;

import java.util.Scanner;

public class A02_BuyulSayiMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();

        System.out.println(buyukOlan(sayi1, sayi2));
        int enb=buyukOlan(sayi1,sayi2);
        System.out.println("en buyuk="+enb);


    }public static int buyukOlan(int a,int b){
        // 1. yontem
         int donecek=0;
        if (a>b){
            donecek=a;
        }
        if (a<b){
            donecek=b;
        }return donecek;

        //2. yontem
        //return a>b ? a: b;

        // 3. yontem
     //   if (a>b)
     //       return a;
      //  else
      //      return b;

    }
}
