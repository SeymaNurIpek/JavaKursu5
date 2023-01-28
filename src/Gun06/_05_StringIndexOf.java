package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        /*
        01234: Harflerin oda numaralari 0`dan baslar: index.
        Bugun
         */
        String cumle="Merhaba Dunya";
        //D`nin index`i kactir
        //M`nin index`i kactir
        //0(506) 3325546  in oda numarasi kactir
        // verilen karakterin string icindeki index ini verir
        System.out.println("cumle.indexOf(M)= "+cumle.indexOf("M"));//0
        System.out.println("cumle.indexOf(a) "+ cumle.indexOf("a"));//4
        System.out.println("cumle.indexOf(ha)= "+cumle.indexOf("ha"));//3
        System.out.println("cumle.indexOf( ): " +cumle.indexOf(" "));//7
        System.out.println("cumle.indexOf(A) ="+cumle.indexOf("A"));//-1
        System.out.println("cumle.indexOf(a,5) ="+cumle.indexOf("a",5));//6
        // a`yi arama 5 (dahil) nolu index`ten sonra baslar

    }
}
