package Gun39.Soru5_1;

import MyFunc.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe{
    public static void main(String[] args) {
        List<IFood> siparisler=new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        int secim=0;
        do {
            menu();
            secim=scan.nextInt();
            switch (secim){
                case 1:IFood ak= new AdanaKebap(); siparisler.add(ak);break;
                case 2:IFood lm= new Lahmacun();siparisler.add(lm);break;
                case 3:IFood b=  new Borsh(); siparisler.add(b);break;
                case 4:Palov p=  new Palov(); siparisler.add(p);break;
            }
        }while (secim<5);

        System.out.println("Alinan Siparisler: ");
        for (IFood f: siparisler){
            System.out.println(f.getClass().getSimpleName());
        }
        System.out.println("Siparisleriniz hazirlaniyor\n");
        MyFunc.bekle(2);
        double toplam=0;
        for (IFood f:siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
        }
        System.out.println("Toplam ucret= "+toplam);

    }public static void menu(){
        System.out.println("****Menu****" +
                "\n1-Adana Kebap (55 TL)\n" +
                "2-Lahmacun (33 TL)\n" +
                "3-Borsh (33 TL)\n" +
                "4-Palov (44 TL)\n" +
                "0-Tamam\n"+
                "Seciminiz: ");
    }
}
