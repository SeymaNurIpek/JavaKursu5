package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        /*
        Istenilen noktadaki karakteri verir
        Karakterlerin sirasi 0`dan baslarve buna index denir
         */
        String cumle="Merhaba dunya";
        char ilkHarf=cumle.charAt(0);
        System.out.println("IlkHarf= "+ilkHarf);//0. index`deki karakteri ver
        System.out.println(cumle.charAt(0));
    }
}
