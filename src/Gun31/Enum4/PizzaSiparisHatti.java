package Gun31.Enum4;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();
       int secim=0;
        do {
            menu();
            secim=scan.nextInt();
            switch (secim){
                case 1: Pizza sp= new Pizza(PizzaSize.SMALL);
                siparisler.add(sp);break;
                case 2:Pizza mp= new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);break;
                case 3:Pizza lp= new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);break;
                case 4:siparisYazdir(siparisler);break;
            }


        }while (secim<=4);


    }
    public  static void menu(){
        System.out.println("****** Pizza Menu ********");
        System.out.println("1- Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Isleme Al-Siparisleri Goster");
        System.out.println("5-Cikis");
        System.out.println("Seciminiz= ");

    }
    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0,m=0,l=0;

        for (Pizza p:siparisler) {
            if (p.size==PizzaSize.SMALL) s++;
            else if (p.size==PizzaSize.MEDIUM) m++;
            else if (p.size==PizzaSize.LARGE) l++;


        }
        System.out.println("****** Siparisleriniz *******");
        System.out.println("Small pizza count= "+s);
        System.out.println("Medium pizza count= "+m);
        System.out.println("Large pizza count= "+l);

    }
}
