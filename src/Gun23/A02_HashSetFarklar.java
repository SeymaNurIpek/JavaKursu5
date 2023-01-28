package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A02_HashSetFarklar {
    public static void main(String[] args) {

        //Hizli oldugu icin kendine gore algoritmik sirada tutar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);//hs = [bes, dort, iki, bir, uc]

        // Ekleme sirasina gore sirali tutar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);//lhs = [bir, iki, uc, dort, bes]

        // Herzaman icin sirali sekilde tutar
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);//ts = [bes, bir, dort, iki, uc]



    }
}
