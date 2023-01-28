package Gun07;

public class _03_StringEmpty {
    public static void main(String[] args) {
        //isEmpty : Bir String icinde birsey(bosluk) var mi yok mu boolean olarak verir

        String s1="Merhaba";
        System.out.println("s1.isEmpty()= "+s1.isEmpty());//false

        String s2=" ";
        System.out.println("s2.isEmpty()= "+s2.isEmpty());//false

        String s3=""; //hiclik
        System.out.println("s3.isEmpty()= "+s3.isEmpty());//true

    }
}
