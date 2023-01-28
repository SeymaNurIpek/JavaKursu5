package Gun12;

import java.util.Scanner;

public class A04_Switch {
    public static void main(String[] args) {
        /*
        Kullanicinin girdigi gun numarasina karsilik gelen gun adini yaziniz
         */
        // iflerde tek deger olmasi durumunda  2 den fazla if kullanmam gerekiyorsa switch diger durumlarda if
        Scanner scan=new Scanner(System.in);
        System.out.println("Gun no= ");
        int gunNo=scan.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");

        }
    }
}
