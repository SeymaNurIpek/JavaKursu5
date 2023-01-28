package Odevler.Odev3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Apple için bir ifade giriniz : ");
        String s1 = input.nextLine();
        System.out.print("Apple için ikinci bir ifade giriniz : ");
        String s2 = input.nextLine();

        Apple apple=new Apple();
        apple.options(s1,s2);
        System.out.println("Phone.getSum(Phone.cart) = " + Phone.getSum(Phone.cart));


        System.out.print("Samsung için bir ifade giriniz : ");
        String s3 = input.nextLine();
        System.out.print("Samsung için ikinci bir ifade giriniz : ");
        String s4 = input.nextLine();

        Samsung samsung=new Samsung();
        samsung.options(s3,s4);

        System.out.println("Phone.getSum(Phone.cart) = " + Phone.getSum(Phone.cart));
    }
}
