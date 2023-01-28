package AhmetHoca.BirinciHafta;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // Verilen String de bosluklari kaldirarak ekrana yeniden yazdiriniz...
// String methodlarindan uygun olanini kullaniniz...
        String givenString = "8 8 Bi fk8h B 8 BB8B B B B888 c hl8 BhB fd";

        System.out.println(givenString.replaceAll(" ",""));

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println(cumle.replaceAll(" ",""));



    }
}
