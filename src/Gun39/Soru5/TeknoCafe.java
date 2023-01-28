package Gun39.Soru5;

import java.util.ArrayList;
import java.util.Scanner;

public class TeknoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> foods=new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        int userChoice;//Kullanıcı Seçimi
        int numberOfOrders;//Siparisi sayisi
        do {
            System.out.println("*******Techno Cafe`mize Hosgeldiniz*******");
            System.out.println("1-Adana Kebap (55 TL)\n2-Lahmacun (33 TL)\n3-Borsh (33 TL)\n4-Palov (44 TL)\n0-Tamam");
            System.out.println("Lutfen siparis etmek istediginiz yemegin numarasini giriniz");
            userChoice=scan.nextInt();

            switch (userChoice){
                case 1: AdanaKebap adanaKebap=new AdanaKebap();
                    System.out.println("Adana Kebab siparisiniz aliniyor\n" +
                            "Siparis adedini giriniz");
                    numberOfOrders=scan.nextInt();
                    for (int i = 0; i <=numberOfOrders ; i++) {foods.add(adanaKebap);}break;
                case 2: Lahmacun lahmacun=new Lahmacun();
                    System.out.println("Lahmacun siparisiniz aliniyor\n" +
                            "Siparis adedini giriniz");
                    numberOfOrders=scan.nextInt();
                    for (int i = 0; i <=numberOfOrders ; i++) {foods.add(lahmacun);}break;
                case 3: Borsh borsh=new Borsh();
                    System.out.println("Borsh siparisiniz aliniyor\n" +
                            "Siparis adedini giriniz");
                    numberOfOrders=scan.nextInt();
                    for (int i = 0; i <=numberOfOrders ; i++) {foods.add(borsh);}break;
                case 4: Palov palov=new Palov();
                    System.out.println("Palov siparisiniz aliniyor\n" +
                            "Siparis adedini giriniz");
                    numberOfOrders=scan.nextInt();
                    for (int i = 0; i <=numberOfOrders ; i++) {foods.add(palov);}break;
                case 0:break;
                default:
                    System.out.println("Hatali secim yaptiniz");

            }
        }while (userChoice!=0);

        double foodFee=0;//yemek Ucreti
        for (IFood food:foods){
            TechnoKitchen.hazirla(food);
            foodFee+=food.ucret();

        }
        System.out.println("Sepetinize "+foods.size()+" adet urun var");
        System.out.println("Hesap = "+foodFee+ "Tl");
    }
}
