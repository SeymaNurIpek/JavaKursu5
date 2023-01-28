package Gun11;

public class A08_JavaRandom {
    public static void main(String[] args) {
        /*
        1- Math.Random(): double sayi uretir 0-0.999999 arasi uretir
         */
        double randSayi=Math.random();
        System.out.println("randSayi= "+randSayi);
        /*
        0-6 arasi uretsin
        6 ile carparim
        0-5.99999999
        int cevir 0-5
         */
        int randTamSayi=(int) (Math.random()*6);
        System.out.println("randTamSayi= "+randTamSayi);

    }
}
