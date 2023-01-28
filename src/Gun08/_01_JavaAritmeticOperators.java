package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("Toplama Islemi");
        System.out.println("a+b= "+(a+b));// 14

        System.out.println("Cikarma islemi");
        System.out.println("a-b= "+(a-b));//4

        System.out.println("Carpma islemi");
        System.out.println("a*b= "+(a*b));//45

        System.out.println("Bolme islemi");
        System.out.println("a/b= "+(a/b));
        //normalde 1.8 olmasi gerekir ama int tam sayi oldugundan sonu 1 olur
        // int/intoldugundan

        // tam sonuc istersek
        System.out.println("(double)a/b= "+((double)a/b));

        //Modul(%) `de sol buyuk ise kalani al
        // sol kucukse solundakini al
    }
}
