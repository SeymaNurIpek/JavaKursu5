package Gun17;

import java.util.Arrays;

public class A06_ArrayMethodlar {
    public static void main(String[] args) {
        String [] isimler={"ahmet","emre","seyma","yasin","emine"};
        //diziyi string olarak direk yazdirir
        System.out.println("isimler= "+ Arrays.toString(isimler));

        //dizi siralama
        Arrays.sort(isimler);
        System.out.println("isimler= "+Arrays.toString(isimler));

        //Diziler esit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b)= "+Arrays.equals(a,b));//true
        System.out.println("Arrays.equals(a,c)= "+Arrays.equals(a,c));//false

        Arrays.sort(c);
        System.out.println("Arrays.toString(c)= "+Arrays.toString(c));


        //contains gibi calisir var ise pozitif bir dondurur yok ise negatif
        System.out.println("Arrays.binarySearch()= "+Arrays.binarySearch(b,3));
        Arrays.sort(b);// burda siraliyoruz
        //siralamadan calismiyor
        System.out.println("Arrays.binarySearch()= "+Arrays.binarySearch(b,3));


    }
}
