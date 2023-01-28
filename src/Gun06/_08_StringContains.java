package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        /*
        conctains : bir stringin icerisinde karakter(lerin) var olmadigini
        boolean cinsinden soyle true veya false
         */
        String cumle="Merhaba dunya";
        boolean varMi=cumle.contains("a");
        System.out.println("varMi = "+varMi);

        //direkt de yazabilirsiniz
        System.out.println("varMi = "+cumle.contains("a"));

        System.out.println("cumle.contains(ya) = "+cumle.contains("ya"));
        System.out.println("cumle.contains(k) = "+cumle.contains("k"));

    }
}
