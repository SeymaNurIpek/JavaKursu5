package Gun12;

import java.util.Scanner;

public class A06_SwitchSoru3 {
    public static void main(String[] args) {
        // girilen bir sayinin birler basamagini degerini yazi ile yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        int sr=sayi%10;
        System.out.println(sr);
        switch (sr){
            case 0: System.out.println("sifir");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("uc");break;
            case 4: System.out.println("dort");break;
            case 5: System.out.println("bes");break;
            case 6: System.out.println("alti");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
            default:
                System.out.println("yanlis giris");
        }
    }
}
