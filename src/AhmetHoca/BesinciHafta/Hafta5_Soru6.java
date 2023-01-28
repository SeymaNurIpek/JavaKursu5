package AhmetHoca.BesinciHafta;

import java.util.Scanner;

public class Hafta5_Soru6 {
    public static void main(String[] args) {
        // TODO Method Soru 2 - Bir String de tum sesli harfleri sayan bir method yaziniz....
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.println(sesliHarf(str));

    }public static int sesliHarf( String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
                    str.charAt(i)=='o'|| str.charAt(i)=='u')
                count++;


        }
        return count;
    }
}
