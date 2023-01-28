package AhmetHoca.IkinciHafta;

import java.util.Scanner;

public class SoruHafta2_3 {
    public static void main(String[] args) {
        // ORNEK SORU2 : Trafikte seyir halindeki kullanıcıdan trafik
// ışıklarından hangisinin yandığı bilgisini alıp
// yönlendirme yapan programı yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen trafikte yanan isigi yaziniz");
        String renk=scan.nextLine();

        if (renk.equalsIgnoreCase("kirmizi")) {
            System.out.println("Dur");
        } else if (renk.equalsIgnoreCase("sari")) {
            System.out.println("Hazirlan");

        }else {System.out.println("Hadi artik git");}


    }
}
